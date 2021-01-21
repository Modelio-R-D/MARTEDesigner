package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("23c6b620-b29f-48ec-aaa4-f6887efb4c2f")
public class ClockResource_Node extends TimingResource_Node {
    @objid ("64b0b008-9f12-4e6a-b4e7-9b25f91476f5")
    public ClockResource_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CLOCKRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.CLOCKRESOURCE_CLASSIFIER));
    }

    @objid ("550d3042-83a5-4d9a-bc08-5faed4f8df2c")
    public ClockResource_Node(final Node element) {
        super(element);
    }

}
