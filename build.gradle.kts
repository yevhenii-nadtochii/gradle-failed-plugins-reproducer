plugins {
    java
    with(io.my.project.ErrorProne) { id(pluginId).version(pluginVer) }
}
