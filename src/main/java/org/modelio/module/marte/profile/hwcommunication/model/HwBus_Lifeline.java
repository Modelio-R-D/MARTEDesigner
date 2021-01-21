package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("a6ce326a-732e-4ee4-9df0-86fb65a89dd9")
public class HwBus_Lifeline extends HwMedia_Lifeline {
    @objid ("ee70d884-31c8-4fab-874d-171131b7bd26")
    public HwBus_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBUS_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("HwBus_Lifeline"));
    }

    @objid ("71a0aa25-ae1f-45bc-a8f7-23b63592f854")
    public HwBus_Lifeline(Lifeline element) {
        super(element);
    }

    @objid ("a0d93ba5-44a4-4dab-90fd-b5432a7f8b7b")
    public String getadressWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_LIFELINE_HWBUS_LIFELINE_ADRESSWIDTH, this.element);
    }

    @objid ("d02fd65e-f376-425a-b2ab-d6cc35cf7e3d")
    public void setadressWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBUS_LIFELINE_HWBUS_LIFELINE_ADRESSWIDTH, value);
    }

    @objid ("39e21935-8ff9-4a82-9c00-cca873ecc615")
    public String getwordWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_LIFELINE_HWBUS_LIFELINE_WORDWIDTH, this.element);
    }

    @objid ("a53db4e1-5a58-48a7-b6d8-914766ad0270")
    public void setwordWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBUS_LIFELINE_HWBUS_LIFELINE_WORDWIDTH, value);
    }

    @objid ("5c636cc0-a247-4934-8d34-4d4ef8f5323c")
    public boolean isisSynchronous() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_LIFELINE_HWBUS_LIFELINE_ISSYNCHRONOUS, this.element);
    }

    @objid ("a3431c3d-22e0-420f-b899-fcb3fcaa040d")
    public void isisSynchronous(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWBUS_LIFELINE_HWBUS_LIFELINE_ISSYNCHRONOUS,value);
    }

    @objid ("2ee44d72-c8be-45e0-a5c4-3a34db5c2644")
    public boolean isisSerial() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_LIFELINE_HWBUS_LIFELINE_ISSERIAL, this.element);
    }

    @objid ("f2305392-34c4-40c5-9219-8099fb3647ab")
    public void isisSerial(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWBUS_LIFELINE_HWBUS_LIFELINE_ISSERIAL,value);
    }

    @objid ("16e81049-e560-4009-938a-404222000a46")
    public Lifeline getElement() {
        return this.element;
    }

}
