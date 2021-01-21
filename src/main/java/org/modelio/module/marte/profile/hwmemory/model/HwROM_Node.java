package org.modelio.module.marte.profile.hwmemory.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("2eabf8ef-d6eb-4e13-ba4a-8ec38dd7bde5")
public class HwROM_Node extends HwMemory_Node {
    @objid ("8d65bc7f-8d53-44f7-8876-3013c7cc303c")
    public HwROM_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWROM_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWROM_CLASSIFIER));
    }

    @objid ("94655187-e4e8-4635-b421-4ff6b748bbf2")
    public HwROM_Node(Node element) {
        super(element);
    }

    @objid ("7dc6c540-69b1-4d9c-b4a5-fa60f2a13dbe")
    public String getorganization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWROM_CLASSIFIER_HWROM_CLASSIFIER_ORGANIZATION, this.element);
    }

    @objid ("3b62b8e7-ce60-4cd0-8724-3ffaeb77322f")
    public void setorganization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWROM_CLASSIFIER_HWROM_CLASSIFIER_ORGANIZATION, value);
    }

    @objid ("dd37ba74-6bea-4a93-a4d0-9d493357c752")
    public String gettype() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWROM_CLASSIFIER_HWROM_CLASSIFIER_TYPE, this.element);
    }

    @objid ("d70354c4-fdd9-4165-8c09-f47e3d16d16c")
    public void settype(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWROM_CLASSIFIER_HWROM_CLASSIFIER_TYPE, value);
    }

    @objid ("d11c45fa-a35f-4a8d-9d9d-25025f65c86e")
    public enum ROM_Type {
        maskedROM,
        EPROM,
        OTP_EPROM,
        EEPROM,
        flash,
        other,
        undefined;
    }

}
