/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("6e525ec2-1eb1-4b8f-9f0d-cdc6ef50290b")
    public static final String STEREOTYPE_NAME = "CommunicationEndPoint_Lifeline";

    @objid ("551d39f0-a387-48af-ac0b-a4970280500c")
    public static final String COMMUNICATIONENDPOINT_LIFELINE_PACKETSIZE_TAGTYPE = "CommunicationEndPoint_Lifeline_packetSize";

    /**
     * Tells whether a {@link CommunicationEndPointLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << CommunicationEndPoint_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("afa30fef-f457-4287-a905-febc16903b1b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationEndPointLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << CommunicationEndPoint_Lifeline >> then instantiate a {@link CommunicationEndPointLifeline} proxy.
     * 
     * @return a {@link CommunicationEndPointLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("4e8b9e3d-6ddc-44ed-a000-400591ec446d")
    public static CommunicationEndPointLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationEndPointLifeline.STEREOTYPE_NAME);
        return CommunicationEndPointLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationEndPointLifeline} proxy from a {@link Lifeline} stereotyped << CommunicationEndPoint_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link CommunicationEndPointLifeline} proxy or <i>null</i>.
     */
    @objid ("de4bd8e9-f854-4216-b2f8-899846a686d0")
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
    @objid ("5e18d429-37f2-459c-9ed8-2523835b8cc2")
    public static CommunicationEndPointLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (CommunicationEndPointLifeline.canInstantiate(obj))
        	return new CommunicationEndPointLifeline(obj);
        else
        	throw new IllegalArgumentException("CommunicationEndPointLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("353bf0b3-1f59-42f0-9acc-82b74b5c7971")
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
    @objid ("3573fd12-2b03-433e-8fce-540ca84e6d9f")
    public String getCommunicationEndPoint_Lifeline_packetSize() {
        return this.elt.getTagValue(CommunicationEndPointLifeline.MdaTypes.COMMUNICATIONENDPOINT_LIFELINE_PACKETSIZE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("cd894df4-0f16-4d37-8d2b-365866d9896c")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    @objid ("1c652f90-c06b-45d6-9358-a0b8969dfa6e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'CommunicationEndPoint_Lifeline_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d833772f-723a-4d06-ba74-918f7f5a8c15")
    public void setCommunicationEndPoint_Lifeline_packetSize(final String value) {
        this.elt.putTagValue(CommunicationEndPointLifeline.MdaTypes.COMMUNICATIONENDPOINT_LIFELINE_PACKETSIZE_TAGTYPE_ELT, value);
    }

    @objid ("9b579a71-c3a5-4ab7-b1c1-80804738dc6a")
    protected CommunicationEndPointLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("80594c22-8814-411a-b7bd-1c6e73f5e324")
    public static final class MdaTypes {
        @objid ("e6fe62e0-6e88-44ae-8f8a-22b18b41e9ce")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7d0cab32-7579-4975-bd37-af5082a0bb87")
        public static TagType COMMUNICATIONENDPOINT_LIFELINE_PACKETSIZE_TAGTYPE_ELT;

        @objid ("99e65f22-06ba-4434-9334-2ccfd0e94dbf")
        private static Stereotype MDAASSOCDEP;

        @objid ("8cf82cb9-a045-4484-9d28-3250e4565dcb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a1558d66-bfd4-4b6c-9757-4210a09a542f")
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
