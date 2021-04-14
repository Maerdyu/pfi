# ArrayList
- 底层是数据，默认容量是10，扩容默认1.5倍，如果扩容后仍不满足就以新容量作为容量。线程不安全，modCount不支持并发。
- 平常可以使用的方法 removeIf
- System.arraycopy(sourceArray, sourceIndex, destArray, destIndex, length)