package com.github.xibalbam.testplugintellij.services

import com.intellij.openapi.project.Project
import com.github.xibalbam.testplugintellij.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
