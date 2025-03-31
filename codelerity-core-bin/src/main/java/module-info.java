
module com.codelerity.core.bin {
    requires org.praxislive.code;
    requires org.praxislive.launcher;
    requires org.praxislive.purl;

    exports com.codelerity.core.bin;

    provides org.praxislive.code.LibraryResolver.SystemInfo with
            com.codelerity.core.bin.BOMSystemInfo;

}
