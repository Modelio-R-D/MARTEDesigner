package org.modelio.module.marte.profile.hwtiming.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("4804b8ba-7845-4e88-abeb-5211a622403e")
public class HwClock_Node extends HwTimingResource_Node {
    @objid ("57db8dc8-e71d-4a50-bd09-1e042c554e51")
    public HwClock_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCLOCK_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWCLOCK_CLASSIFIER));
    }

    @objid ("52bcfcd6-5e05-44b5-b9ea-07ad175c8844")
    public HwClock_Node(Node element) {
        super(element);
    }

    @objid ("5195e6dc-0b10-4eb7-b3d6-5415e034cf8a")
    public String getfrenquency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCLOCK_CLASSIFIER_HWCLOCK_CLASSIFIER_FREQUENCY, this.element);
    }

    @objid ("f1dbb68c-3e27-4b08-aa15-ea96a1e65bbe")
    public void setfrenquency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCLOCK_CLASSIFIER_HWCLOCK_CLASSIFIER_FREQUENCY, value);
    }

}
