package com.github.eyadshwiri.myplugin.services

import com.intellij.openapi.project.Project
import com.github.eyadshwiri.myplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
