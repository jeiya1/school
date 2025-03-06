module com.comprog.library {
    requires java.base;
    exports com.comprog.library.author to com.comprog.library.main;
    exports com.comprog.library.id to com.comprog.library.main;
    exports com.comprog.library.title to com.comprog.library.main;
}
