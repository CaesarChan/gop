package com.github.caesarchan.gop.services

import com.intellij.openapi.project.Project
import com.github.caesarchan.gop.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
