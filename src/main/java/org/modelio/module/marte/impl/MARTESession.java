package org.modelio.module.marte.impl;

import java.io.File;
import java.nio.file.Path;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.modelio.api.modelio.mc.IModelComponentDescriptor;
import org.modelio.api.modelio.mc.IModelComponentService;
import org.modelio.api.module.lifecycle.DefaultModuleLifeCycleHandler;
import org.modelio.api.module.lifecycle.ModuleException;
import org.modelio.vbasic.version.Version;

@objid ("c4a101c4-d86a-4942-93d2-823853c11cec")
public class MARTESession extends DefaultModuleLifeCycleHandler {
    @objid ("a3640657-cf13-4751-a8bc-03c92aa3aac0")
    private final String ramcVersion = "4.1.00";

    @objid ("72db42d0-ac80-4654-8426-862edb01f6b3")
    private MARTEHandler modelChangeHandler = null;

    @objid ("3a83cc32-a6a9-41e2-850b-70676ed7290f")
    public MARTESession(MARTEModule module) {
        super(module);
    }

    @objid ("fa77f8e1-ff0a-45ce-a1e6-f51a5d30f236")
    @Override
    public boolean start() throws ModuleException {
        this.modelChangeHandler = new MARTEHandler();
        this.module.getModuleContext().getModelingSession().addModelHandler(this.modelChangeHandler);
        
        installRamc();
        return super.start();
    }

    @objid ("4bc3fb4e-dfb7-4876-9f66-3b6533cc162a")
    @Override
    public void stop() throws ModuleException {
        // Remove contribution from the RamcService
        
        this.module.getModuleContext().getModelingSession().removeModelHandler(this.modelChangeHandler);
        
        super.stop();
    }

    @objid ("6a61fd7f-4db5-4c29-8204-4687f7b64fba")
    @Override
    public boolean select() throws ModuleException {
        return super.select();
    }

    @objid ("88693f15-32a0-4540-8354-950e4d9aef6e")
    @Override
    public void upgrade(Version oldVersion, Map<String, String> oldParameters) throws ModuleException {
        super.upgrade (oldVersion, oldParameters);
    }

    @objid ("5315cab3-2a5f-4d24-b370-508d7472cf96")
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
