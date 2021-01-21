package org.modelio.module.marte.profile.hwmemory.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("b03bf67e-5eb7-418b-9971-594f02f67312")
public class HwROM_BindableInstance extends HwMemory_BindableInstance {
    @objid ("49bad3a0-1c56-4016-82ed-78abfc58402f")
    public HwROM_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWROM_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwROM_BindableInstance"));
    }

    @objid ("01d95133-8cbf-4813-88b8-52b5e0cdb0e0")
    public HwROM_BindableInstance(BindableInstance element) {
        super(element);
    }

    @objid ("9134d511-a601-455a-91ce-a89a78fdafac")
    public String gettype() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWROM_INSTANCE_HWROM_INSTANCE_TYPE, this.element);
    }

    @objid ("00a8647b-553a-46ab-a755-d8e522794d6f")
    public void settype(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWROM_INSTANCE_HWROM_INSTANCE_TYPE, value);
    }

    @objid ("ac70d76c-eb87-4a58-976d-850b1ebad1ec")
    public String getorganization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWROM_INSTANCE_HWROM_INSTANCE_ORGANIZATION, this.element);
    }

    @objid ("c0747bf1-d052-414e-adaa-c4f5f287adae")
    public void setorganization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWROM_INSTANCE_HWROM_INSTANCE_ORGANIZATION, value);
    }

}
