package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("138ccc54-9c0f-4df6-af40-04bc95c6f2c1")
public class TimerResource_Node extends TimingResource_Node {
    @objid ("505702f2-6b56-4993-a417-c87bbdfa3124")
    public TimerResource_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TIMERRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.TIMERRESOURCE_CLASSIFIER));
    }

    @objid ("b998d1bf-1bdb-401e-81a7-c93143fc76b2")
    public TimerResource_Node(final Node element) {
        super(element);
    }

    @objid ("2871faba-9551-4aba-baeb-52904614d42a")
    public String getduration() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_CLASSIFIER_TIMERRESOURCE_CLASSIFIER_DURATION, this.element);
    }

    @objid ("93b78b39-97ec-4763-9f5a-1ab1e05df593")
    public void setduration(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.TIMERRESOURCE_CLASSIFIER_TIMERRESOURCE_CLASSIFIER_DURATION, value);
    }

    @objid ("de11e68f-648b-4cf4-b141-4367b9d003f1")
    public boolean isisPeriodic() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_CLASSIFIER_TIMERRESOURCE_CLASSIFIER_ISPERIODIC, this.element);
    }

    @objid ("c1b264e3-6ed3-4e9d-926e-8274e73128cb")
    public void isisPeriodic(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.TIMERRESOURCE_CLASSIFIER_TIMERRESOURCE_CLASSIFIER_ISPERIODIC,value);
    }

}
