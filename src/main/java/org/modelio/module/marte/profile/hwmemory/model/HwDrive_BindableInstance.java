package org.modelio.module.marte.profile.hwmemory.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("2c65ca99-2e0a-465c-a8d2-c165e402200e")
public class HwDrive_BindableInstance extends HwMemory_BindableInstance {
    @objid ("64fe6b13-8353-4560-a204-1a74fe9e1df6")
    public HwDrive_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWDRIVE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwDrive_BindableInstance"));
    }

    @objid ("709ee042-ebba-49bc-9500-9bb2691ad297")
    public HwDrive_BindableInstance(BindableInstance element) {
        super(element);
    }

    @objid ("128c4a9a-3d27-434c-a09e-c76f195d6e25")
    public String getsectorSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDRIVE_INSTANCE_HWDRIVE_INSTANCE_SECTORSIZE, this.element);
    }

    @objid ("7add1058-efa0-45bb-8a2a-2c40582dab69")
    public void setsectorSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWDRIVE_INSTANCE_HWDRIVE_INSTANCE_SECTORSIZE, value);
    }

    @objid ("d5ba5fc5-1ea7-48b3-a1d1-0032ffb6dea3")
    public String getbuffer() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDRIVE_INSTANCE_HWDRIVE_INSTANCE_BUFFER, this.element);
    }

    @objid ("a257fddd-2b24-4c60-a722-30ca76635691")
    public void setbuffer(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWDRIVE_INSTANCE_HWDRIVE_INSTANCE_BUFFER, value);
    }

}
