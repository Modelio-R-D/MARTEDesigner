/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << CommunicationEndPoint_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("59f1e546-74a7-4252-833e-a8f7b53a241b")
public class CommunicationEndPointLifeline extends ResourceLifeline {
    @objid ("ad1a52fd-a820-4856-96af-581df4656d46")
    public static final String STEREOTYPE_NAME = "CommunicationEndPoint_Lifeline";

    @objid ("9a2c1dd1-e31b-416b-93d7-d944f02a264e")
    public static final String COMMUNICATIONENDPOINT_LIFELINE_PACKETSIZE_TAGTYPE = "CommunicationEndPoint_Lifeline_packetSize";

    /**
     * Tells whether a {@link CommunicationEndPointLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << CommunicationEndPoint_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("6f20e2ab-c69d-48f1-a266-9b631b601bdb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationEndPointLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << CommunicationEndPoint_Lifeline >> then instantiate a {@link CommunicationEndPointLifeline} proxy.
     * 
     * @return a {@link CommunicationEndPointLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("358e02fe-17f5-4133-a41c-5048401826c9")
    public static CommunicationEndPointLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationEndPointLifeline.STEREOTYPE_NAME);
        return CommunicationEndPointLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationEndPointLifeline} proxy from a {@link Lifeline} stereotyped << CommunicationEndPoint_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link CommunicationEndPointLifeline} proxy or <i>null</i>.
     */
    @objid ("c788fd41-9c87-49bf-aa07-49d9e4d6d3fc")
    public static CommunicationEndPointLifeline instantiate(final Lifeline obj) {
        return CommunicationEndPointLifeline.canInstantiate(obj) ? new CommunicationEndPointLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationEndPointLifeline} proxy from a {@link Lifeline} stereotyped << CommunicationEndPoint_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link CommunicationEndPointLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9d21aeb6-b2b0-446f-8dfb-8d70e65c776b")
    public static CommunicationEndPointLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (CommunicationEndPointLifeline.canInstantiate(obj))
        	return new CommunicationEndPointLifeline(obj);
        else
        	throw new IllegalArgumentException("CommunicationEndPointLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ab782280-5df3-4fe1-904d-03439d63147d")
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
        CommunicationEndPointLifeline other = (CommunicationEndPointLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'CommunicationEndPoint_Lifeline_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ccb32783-d19f-49d0-8785-4c784c4126b5")
    public String getCommunicationEndPoint_Lifeline_packetSize() {
        return this.elt.getTagValue(CommunicationEndPointLifeline.MdaTypes.COMMUNICATIONENDPOINT_LIFELINE_PACKETSIZE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("73e3b0de-7129-43be-952c-0338e49a2168")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    @objid ("ef296719-0c04-4477-b49b-9d93e846ea18")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'CommunicationEndPoint_Lifeline_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5406712d-fe1a-4b6c-8d2b-c62640a87c32")
    public void setCommunicationEndPoint_Lifeline_packetSize(final String value) {
        this.elt.putTagValue(CommunicationEndPointLifeline.MdaTypes.COMMUNICATIONENDPOINT_LIFELINE_PACKETSIZE_TAGTYPE_ELT, value);
    }

    @objid ("e269194d-853e-4e34-bc48-7d7362111d45")
    protected CommunicationEndPointLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("80594c22-8814-411a-b7bd-1c6e73f5e324")
    public static final class MdaTypes {
        @objid ("dafed7ac-dfbc-42da-af1a-db15b52ac37c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3150ca37-ab23-48b4-817b-3a47a14b2fde")
        public static TagType COMMUNICATIONENDPOINT_LIFELINE_PACKETSIZE_TAGTYPE_ELT;

        @objid ("0466a406-6deb-4e8b-8081-5d1722274f77")
        private static Stereotype MDAASSOCDEP;

        @objid ("af2ea586-d819-4919-94e8-819b0b9836f4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("af225747-fa1f-4617-8817-3c680e2a6a4f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ffa4f5da-0cce-11df-8525-001302895b2b");
            COMMUNICATIONENDPOINT_LIFELINE_PACKETSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ffa4f5e1-0cce-11df-8525-001302895b2b");
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
