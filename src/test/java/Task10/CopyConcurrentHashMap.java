package Task10;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class CopyConcurrentHashMap<K, V> {

      private Map<K, V> map;

      public CopyConcurrentHashMap(Map<K, V> map) {
            this.map = map;
      }

      public CopyConcurrentHashMap() {
            map = new HashMap<>();
      }


      ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
      Lock readLock = readWriteLock.readLock();
      Lock writeLock = readWriteLock.writeLock();

      public V get(K key){
            readLock.lock();
            try{
                  return map.get(key);
            } finally {
                  readLock.unlock();
            }
      }

      public void remove(K key){
            writeLock.lock();
            try{
                  map.remove(key);
            }finally {
                  writeLock.unlock();
            }
      }

      public V put(K key, V value){
            writeLock.lock();
            try{
                return map.put(key, value);
            } finally {
                  writeLock.unlock();
            }
      }

      public int size(){
            readLock.lock();
            try{
                  return map.size();
            } finally {
                  readLock.unlock();
            }
      }

      public boolean isEmpty(){
            readLock.lock();
            try{
                  return map.isEmpty();
            } finally {
                  readLock.unlock();
            }
      }

      public String toString(){
            readLock.lock();
            try{
                  return map.toString();
            }finally {
                  readLock.unlock();
            }
      }

}