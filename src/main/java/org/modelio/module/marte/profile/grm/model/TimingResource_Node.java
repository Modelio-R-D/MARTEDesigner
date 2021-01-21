package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("2c6c5673-8b74-4fe7-b2a1-277bdf838d7a")
public class TimingResource_Node extends Resource_Node {
    @objid ("3ced67a8-51a6-4814-86dc-5ce0eb668bad")
    public TimingResource_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TIMINGRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.TIMINGRESOURCE_CLASSIFIER));
    }

    @objid ("56f913c8-999c-4b48-bd32-bf4dd92c79fb")
    public TimingResource_Node(final Node element) {
        super(element);
    }

}
