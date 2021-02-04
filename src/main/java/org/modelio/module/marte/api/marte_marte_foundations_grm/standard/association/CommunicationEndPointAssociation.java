/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << CommunicationEndPoint_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f055055b-bd7e-4082-99aa-6eb94d9c676c")
public class CommunicationEndPointAssociation extends ResourceAssociation {
    @objid ("2d8a741a-0bdc-40b7-82ca-b18d5c10e513")
    public static final String STEREOTYPE_NAME = "CommunicationEndPoint_Association";

    @objid ("bab48294-8712-40c5-89bc-79535f20a2cf")
    public static final String COMMUNICATIONENDPOINT_ASSOCIATION_PACKETSIZE_TAGTYPE = "CommunicationEndPoint_Association_packetSize";

    /**
     * Tells whether a {@link CommunicationEndPointAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << CommunicationEndPoint_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1e0147f0-c52b-4321-bcd0-cbf14282c00f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationEndPointAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << CommunicationEndPoint_Association >> then instantiate a {@link CommunicationEndPointAssociation} proxy.
     * 
     * @return a {@link CommunicationEndPointAssociation} proxy on the created {@link Association}.
     */
    @objid ("773f28a2-93a9-445e-9ca1-df9f01e2aa7a")
    public static CommunicationEndPointAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationEndPointAssociation.STEREOTYPE_NAME);
        return CommunicationEndPointAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationEndPointAssociation} proxy from a {@link Association} stereotyped << CommunicationEndPoint_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link CommunicationEndPointAssociation} proxy or <i>null</i>.
     */
    @objid ("0a4c5a93-4a9b-4b1b-b10a-77db45188089")
    public static CommunicationEndPointAssociation instantiate(final Association obj) {
        return CommunicationEndPointAssociation.canInstantiate(obj) ? new CommunicationEndPointAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationEndPointAssociation} proxy from a {@link Association} stereotyped << CommunicationEndPoint_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link CommunicationEndPointAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("29b5b229-e663-4279-9a97-27b12ab71ed3")
    public static CommunicationEndPointAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (CommunicationEndPointAssociation.canInstantiate(obj))
        	return new CommunicationEndPointAssociation(obj);
        else
        	throw new IllegalArgumentException("CommunicationEndPointAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("999f8466-a918-4366-8d72-cabd32d4809b")
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
        CommunicationEndPointAssociation other = (CommunicationEndPointAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'CommunicationEndPoint_Association_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f8d7c7f8-0a2f-4bab-8512-1246dfd2dbc6")
    public String getCommunicationEndPoint_Association_packetSize() {
        return this.elt.getTagValue(CommunicationEndPointAssociation.MdaTypes.COMMUNICATIONENDPOINT_ASSOCIATION_PACKETSIZE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("ac2c69f0-668b-42b7-820d-efad90f949b3")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    @objid ("0279af30-830b-413b-9598-82c8399fc77a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'CommunicationEndPoint_Association_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9d3ebf28-8fc5-4dd3-b807-232d3017c3a6")
    public void setCommunicationEndPoint_Association_packetSize(final String value) {
        this.elt.putTagValue(CommunicationEndPointAssociation.MdaTypes.COMMUNICATIONENDPOINT_ASSOCIATION_PACKETSIZE_TAGTYPE_ELT, value);
    }

    @objid ("98f208df-50c9-4f90-9f04-74d02bdd62e2")
    protected CommunicationEndPointAssociation(final Association elt) {
        super(elt);
    }

    @objid ("3d4380b0-c558-4af3-aff8-334c5bae1241")
    public static final class MdaTypes {
        @objid ("4adc74ec-9a34-400e-9ee5-d18e4ca8cbb9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e2a2beeb-7199-4ca2-8ccd-3fbff0f824c7")
        public static TagType COMMUNICATIONENDPOINT_ASSOCIATION_PACKETSIZE_TAGTYPE_ELT;

        @objid ("a5807235-e189-45bf-a279-3cb01a2e4233")
        private static Stereotype MDAASSOCDEP;

        @objid ("cbf2b181-ec47-4f88-a607-a8fbb26f098f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5b3cfe21-5e8c-4d13-8d5a-fb9c45a7c182")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "a3e86d85-0f46-11df-8c52-0014222a9f79");
            COMMUNICATIONENDPOINT_ASSOCIATION_PACKETSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7cb845e5-0f47-11df-8c52-0014222a9f79");
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
