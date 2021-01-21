package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("a7133b4f-6110-4d56-a2a1-edf9a3b14b23")
public class HwMedia_Node extends HwCommunicationResource_Node {
    @objid ("cd6824ae-c814-419d-adf0-9b0c46cbdee0")
    public HwMedia_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWMEDIA_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWMEDIA_CLASSIFIER));
    }

    @objid ("d8d8f733-881e-4749-a1a3-9aa146546097")
    public HwMedia_Node(Node element) {
        super(element);
    }

    @objid ("d5a01521-579d-4d43-953d-277516b18278")
    public String getarbiters() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEDIA_CLASSIFIER_HWMEDIA_CLASSIFIER_ARBITERS, this.element);
    }

    @objid ("48641f31-ad78-4072-aaa9-c4b08795a93e")
    public void setarbiters(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEDIA_CLASSIFIER_HWMEDIA_CLASSIFIER_ARBITERS, value);
    }

}
