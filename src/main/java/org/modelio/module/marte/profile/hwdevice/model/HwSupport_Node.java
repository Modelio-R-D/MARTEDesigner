package org.modelio.module.marte.profile.hwdevice.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("a26a1023-4019-49f7-ad91-a5905f91f67f")
public class HwSupport_Node {
    @objid ("1630c6b3-5ec2-444e-b367-8e1ab483d628")
    protected Node element;

    @objid ("768e64c1-0a3b-4424-a2f7-09c8c9d697b3")
    public HwSupport_Node() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWSUPPORT_CLASSIFIER);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWSUPPORT_CLASSIFIER));
    }

    @objid ("d74dc0b3-2ef4-4ec3-84c7-4a22d94459ee")
    public HwSupport_Node(Node element) {
        this.element = element;
    }

    @objid ("06ce2b05-d8e0-4fb5-ade9-ebde7da39f50")
    public Node getElement() {
        return this.element;
    }

    @objid ("f24f43af-a3eb-4cfd-93f2-759c4144998a")
    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    @objid ("8d2b2af7-d965-40bf-a307-4151834ccf0a")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

}
