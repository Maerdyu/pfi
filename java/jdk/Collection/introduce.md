- 集合类的基础类以及相关类
    #### 接口:Iterable
    iterator() 返回一个迭代器接口(不同集合有自己的实现,用来遍历)
    forEach(Consumer<? super T> action) 用foreach遍历
    spliterator() 不清楚待补充

    #### 接口:Collection接口 继承接口 [Iterable]
     toArray 指定返回的类型 [code](Java/code/src/collection/CollectionTest.java)
     removeIf 删除指定的对象，还是基于迭代器实现[code](Java/code/src/collection/CollectionTest.java)
    
    ####迭代器（Iterator）
    