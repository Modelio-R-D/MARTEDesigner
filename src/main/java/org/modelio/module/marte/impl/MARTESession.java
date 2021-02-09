package org.modelio.module.marte.impl;

import java.io.File;
import java.nio.file.Path;
import java.util.Map;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.modelio.api.modelio.mc.IModelComponentDescriptor;
import org.modelio.api.modelio.mc.IModelComponentService;
import org.modelio.api.module.lifecycle.DefaultModuleLifeCycleHandler;
import org.modelio.api.module.lifecycle.ModuleException;
import org.modelio.vbasic.version.Version;

public class MARTESession extends DefaultModuleLifeCycleHandler {
    private final String ramcVersion = "4.1.01";

    private MARTEHandler modelChangeHandler = null;

    public MARTESession(MARTEModule module) {
        super(module);
    }

    @Override
    public boolean start() throws ModuleException {
        this.modelChangeHandler = new MARTEHandler();
        this.module.getModuleContext().getModelingSession().addModelHandler(this.modelChangeHandler);
        
        installRamc();
        return super.start();
    }

    @Override
    public void stop() throws ModuleException {
        // Remove contribution from the RamcService
        
        this.module.getModuleContext().getModelingSession().removeModelHandler(this.modelChangeHandler);
        
        super.stop();
    }

    @Override
    public boolean select() throws ModuleException {
        return super.select();
    }

    @Override
    public void upgrade(Version oldVersion, Map<String, String> oldParameters) throws ModuleException {
        super.upgrade (oldVersion, oldParameters);
    }

    private void installRamc() {
        Path mdaplugsPath = this.module.getModuleContext().getConfiguration().getModuleResourcesPath();
        
        final IModelComponentService modelComponentService =  MARTEModule.getInstance().getModuleContext().getModelioServices().getModelComponentService();
        for (IModelComponentDescriptor mc : modelComponentService.getModelComponents()) {
            if (mc.getName().equals("MARTELibrary")) {
                if (new Version(mc.getVersion()).isOlderThan(new Version(this.ramcVersion))) {
                    modelComponentService.deployModelComponent(new File(mdaplugsPath.resolve("res" + File.separator + "ramc" + File.separator + "MARTELibrary.ramc").toString()), new NullProgressMonitor());
                } else {
                    // Ramc already deployed...
                    return;
                }
            }
        }
        
        // No ramc found, deploy it
        modelComponentService.deployModelComponent(new File(mdaplugsPath.resolve("res" + File.separator + "ramc" + File.separator + "MARTELibrary.ramc").toString()), new NullProgressMonitor());
    }

}
