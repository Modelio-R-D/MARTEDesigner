package org.modelio.module.marte.profile.gqam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("1d02b3c5-4fea-451d-9d68-b028df0f6fe4")
public class GaCommChannel_Association {
    @objid ("ab425c47-01fa-40c6-8065-725f87bacf1a")
    protected Association element;

    @objid ("1f5c20e2-8efb-4679-85b1-34827dd3769d")
    public GaCommChannel_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GACOMMCHANNEL_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("GaCommChannel_Association"));
    }

    @objid ("1aa39586-a139-4a05-8406-4853e54ed70e")
    public GaCommChannel_Association(Association element) {
        this.element = element;
    }

    @objid ("86363fcb-106a-47e7-8eba-ca0ca35ccc15")
    public void setParent(AssociationEnd source, AssociationEnd destination) {
        this.element.getEnd().add(source);
        this.element.getEnd().add(destination);
    }

    @objid ("79816f1e-7f0d-466b-afeb-8a654bd2fcfe")
    public Association getElement() {
        return this.element;
    }

    @objid ("651a30ad-17bf-4b75-9f0d-f854be771d8c")
    public String getpacketSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMCHANNEL_ASSOCIATION_GACOMMCHANNEL_ASSOCIATION_PACKETSIZE, this.element);
    }

    @objid ("e3b94fb0-8521-41ed-b354-0db1932d08cb")
    public void setpacketSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMCHANNEL_ASSOCIATION_GACOMMCHANNEL_ASSOCIATION_PACKETSIZE, value);
    }

    @objid ("24dfa249-67e9-4850-bb90-259e8d835486")
    public String getutlization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMCHANNEL_ASSOCIATION_GACOMMCHANNEL_ASSOCIATION_UTILIZATION, this.element);
    }

    @objid ("1b6ebf8c-3689-4262-8041-d8fc570a0110")
    public void setutlization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMCHANNEL_ASSOCIATION_GACOMMCHANNEL_ASSOCIATION_UTILIZATION, value);
    }

}
