/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << CommunicationEndPoint_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("beaef391-b721-461b-9645-6a48842d73f2")
public class CommunicationEndPointAssociationEnd extends ResourceAssociationEnd {
    @objid ("0f204057-9eb1-4161-adf2-1f069c569dca")
    public static final String STEREOTYPE_NAME = "CommunicationEndPoint_AssociationEnd";

    @objid ("a8df4b2c-73a0-43d1-a57f-d0fd5cb440f6")
    public static final String COMMUNICATIONENDPOINT_ASSOCIATIONEND_PACKETSIZE_TAGTYPE = "CommunicationEndPoint_AssociationEnd_packetSize";

    /**
     * Tells whether a {@link CommunicationEndPointAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << CommunicationEndPoint_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("c9486d51-75fb-45c4-8a25-b12ebdaa35bf")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationEndPointAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << CommunicationEndPoint_AssociationEnd >> then instantiate a {@link CommunicationEndPointAssociationEnd} proxy.
     * 
     * @return a {@link CommunicationEndPointAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("6629f6e0-5f25-4a69-b2a8-af628e8fa1f4")
    public static CommunicationEndPointAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationEndPointAssociationEnd.STEREOTYPE_NAME);
        return CommunicationEndPointAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationEndPointAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << CommunicationEndPoint_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link CommunicationEndPointAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("bd91b8cf-b98e-43ee-a314-706128f4a722")
    public static CommunicationEndPointAssociationEnd instantiate(final AssociationEnd obj) {
        return CommunicationEndPointAssociationEnd.canInstantiate(obj) ? new CommunicationEndPointAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationEndPointAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << CommunicationEndPoint_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link CommunicationEndPointAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("96055cf3-5c43-4621-ab5e-f5697265f5a0")
    public static CommunicationEndPointAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (CommunicationEndPointAssociationEnd.canInstantiate(obj))
        	return new CommunicationEndPointAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("CommunicationEndPointAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("82b19c8c-4eef-49b1-9464-a0e4e758dafc")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        CommunicationEndPointAssociationEnd other = (CommunicationEndPointAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'CommunicationEndPoint_AssociationEnd_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d7ad7e7d-01b5-4cf3-a505-7d60230219ba")
    public String getCommunicationEndPoint_AssociationEnd_packetSize() {
        return this.elt.getTagValue(CommunicationEndPointAssociationEnd.MdaTypes.COMMUNICATIONENDPOINT_ASSOCIATIONEND_PACKETSIZE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("f763f6a4-3c15-47e1-b96f-62011d7b89ec")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    @objid ("f37ec4fe-2d33-4458-862d-02b440e436c5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'CommunicationEndPoint_AssociationEnd_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c158d2ef-3d9e-4287-8969-d3aa086665fb")
    public void setCommunicationEndPoint_AssociationEnd_packetSize(final String value) {
        this.elt.putTagValue(CommunicationEndPointAssociationEnd.MdaTypes.COMMUNICATIONENDPOINT_ASSOCIATIONEND_PACKETSIZE_TAGTYPE_ELT, value);
    }

    @objid ("965e679b-5936-47b0-b7d8-07f0cf794711")
    protected CommunicationEndPointAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("84e492ab-65b7-4152-8628-1d5604e18815")
    public static final class MdaTypes {
        @objid ("fc1e5ece-42b7-474b-a3eb-46f8185b473f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("62184aa2-3791-45cc-a3ab-0406a485260c")
        public static TagType COMMUNICATIONENDPOINT_ASSOCIATIONEND_PACKETSIZE_TAGTYPE_ELT;

        @objid ("1e13318f-7bd4-4334-8f6d-7bc5176f50b8")
        private static Stereotype MDAASSOCDEP;

        @objid ("ad5ec453-28da-4525-a26e-9ba7b24921df")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2829d778-94b6-4012-a383-11492763943b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ffa4f5d7-0cce-11df-8525-001302895b2b");
            COMMUNICATIONENDPOINT_ASSOCIATIONEND_PACKETSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ffa4f5de-0cce-11df-8525-001302895b2b");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}
