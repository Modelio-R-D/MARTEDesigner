package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwgeneral.model.HwResource_Class;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("63d29bd2-210f-46d8-8eb0-d121c29d9a32")
public class HwBranchPredictor_Class extends HwResource_Class {
    @objid ("4b4419d5-d5ea-49ca-b8b4-5ab798e98043")
    public HwBranchPredictor_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBRANCHPREDICTOR_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWBRANCHPREDICTOR_CLASSIFIER));
    }

    @objid ("156892a8-e792-4ea2-9fc1-3b211a922e41")
    public HwBranchPredictor_Class(Class element) {
        super(element);
    }

}
