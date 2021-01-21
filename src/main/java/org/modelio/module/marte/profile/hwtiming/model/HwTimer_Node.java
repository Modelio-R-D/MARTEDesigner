package org.modelio.module.marte.profile.hwtiming.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("23cc4cdc-a741-4071-9006-b9a13639420d")
public class HwTimer_Node extends HwTimingResource_Node {
    @objid ("479eaa1b-23ac-4da5-9df2-78ce923e659c")
    public HwTimer_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWTIMER_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWTIMER_CLASSIFIER));
    }

    @objid ("55da67de-8164-4eea-83f9-f1d50ce702d8")
    public HwTimer_Node(Node element) {
        super(element);
    }

    @objid ("f66562e5-d32d-4628-aea1-8ea0119786d3")
    public String getnbCounters() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMER_CLASSIFIER_HWTIMER_CLASSIFIER_NBCOUNTERS, this.element);
    }

    @objid ("50b76503-677f-41b2-9924-2c31518bcf4e")
    public void setnbCounters(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMER_CLASSIFIER_HWTIMER_CLASSIFIER_NBCOUNTERS, value);
    }

    @objid ("2bc15f29-5bf7-420c-811c-d13a209abf75")
    public String getcounterWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMER_CLASSIFIER_HWTIMER_CLASSIFIER_COUNTERWIDTH, this.element);
    }

    @objid ("5c858588-9ee3-4bba-abcd-db247995ec5d")
    public void setcounterWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMER_CLASSIFIER_HWTIMER_CLASSIFIER_COUNTERWIDTH, value);
    }

    @objid ("fbd9306c-7385-4a1a-94ad-e9dee0976a01")
    public String getinputClock() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMER_CLASSIFIER_HWTIMER_CLASSIFIER_INPUTCLOCK, this.element);
    }

    @objid ("51ac7b5e-5bf6-4c37-a102-424eb8a0658a")
    public void setinputClock(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMER_CLASSIFIER_HWTIMER_CLASSIFIER_INPUTCLOCK, value);
    }

}
