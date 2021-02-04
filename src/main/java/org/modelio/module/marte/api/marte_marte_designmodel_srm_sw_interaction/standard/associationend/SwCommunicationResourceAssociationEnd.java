/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.associationend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
 * Proxy class to handle a {@link AssociationEnd} with << SwCommunicationResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("4449d223-6713-497a-8889-7eaa99f85232")
public class SwCommunicationResourceAssociationEnd extends SwInteractionResourceAssociationEnd {
    @objid ("3eb74c22-5ce6-4feb-b635-a57e1e8e2c98")
    public static final String STEREOTYPE_NAME = "SwCommunicationResource_AssociationEnd";

    @objid ("e4bdda22-65ac-4f72-8546-eeef6be7a828")
    public static final String SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_BLOCKT_TAGTYPE = "SwCommunicationResource_AssociationEnd_blockT";

    @objid ("ea0e8b51-2403-4054-a668-9e793513acca")
    public static final String SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_CAPACITY_TAGTYPE = "SwCommunicationResource_AssociationEnd_capacity";

    @objid ("c9310cc5-59b7-4109-9f18-31430b4d69f8")
    public static final String SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_ELEMENTSIZE_TAGTYPE = "SwCommunicationResource_AssociationEnd_elementSize";

    @objid ("e7c691c4-6cb6-4918-9886-a7786ec93784")
    public static final String SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_MAINSCHEDULER_TAGTYPE = "SwCommunicationResource_AssociationEnd_mainScheduler";

    @objid ("7ee250b2-b932-4904-99fe-619deb7e476c")
    public static final String SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_PACKETT_TAGTYPE = "SwCommunicationResource_AssociationEnd_packetT";

    @objid ("aa87d219-0d31-40c7-81ac-4c37c7883eb0")
    public static final String SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_SPEEDFACTOR_TAGTYPE = "SwCommunicationResource_AssociationEnd_speedFactor";

    @objid ("93b4da68-655a-4b3f-8288-4e47885a69eb")
    public static final String SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_TRANSMMODE_TAGTYPE = "SwCommunicationResource_AssociationEnd_transmMode";

    /**
     * Tells whether a {@link SwCommunicationResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << SwCommunicationResource_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bfd78faf-ab9a-41ee-9891-23d64101db73")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwCommunicationResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << SwCommunicationResource_AssociationEnd >> then instantiate a {@link SwCommunicationResourceAssociationEnd} proxy.
     * 
     * @return a {@link SwCommunicationResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("675fe9d0-67cc-4264-8e0b-a95a80ece6c0")
    public static SwCommunicationResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwCommunicationResourceAssociationEnd.STEREOTYPE_NAME);
        return SwCommunicationResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link SwCommunicationResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SwCommunicationResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link SwCommunicationResourceAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("8244dbd4-2eb9-4d7f-ae5c-efaa4997f470")
    public static SwCommunicationResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return SwCommunicationResourceAssociationEnd.canInstantiate(obj) ? new SwCommunicationResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwCommunicationResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SwCommunicationResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link SwCommunicationResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("396e274a-80b9-41f8-9de4-be4ed3dc9813")
    public static SwCommunicationResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (SwCommunicationResourceAssociationEnd.canInstantiate(obj))
        	return new SwCommunicationResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("SwCommunicationResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1db783c3-7be5-4ae4-9829-cd7fcd52ee4d")
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
        SwCommunicationResourceAssociationEnd other = (SwCommunicationResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("54eb606a-b955-4c32-9c94-6f0d6a6cd807")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_AssociationEnd_blockT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8ec2c6d4-552c-42ed-ad2c-28bf1ac21f4b")
    public List<String> getSwCommunicationResource_AssociationEnd_blockT() {
        return this.elt.getTagValues(SwCommunicationResourceAssociationEnd.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_AssociationEnd_capacity'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("97128909-a870-4694-869a-c7d1f1f16cb3")
    public List<String> getSwCommunicationResource_AssociationEnd_capacity() {
        return this.elt.getTagValues(SwCommunicationResourceAssociationEnd.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_AssociationEnd_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("723e508d-06d0-4aec-9446-49172deeb26e")
    public String getSwCommunicationResource_AssociationEnd_elementSize() {
        return this.elt.getTagValue(SwCommunicationResourceAssociationEnd.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_AssociationEnd_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0c6d7179-40af-49be-8944-f132dc60493f")
    public String getSwCommunicationResource_AssociationEnd_mainScheduler() {
        return this.elt.getTagValue(SwCommunicationResourceAssociationEnd.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_AssociationEnd_packetT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0e7809c0-2a32-4b1b-9904-cb9a67023f40")
    public List<String> getSwCommunicationResource_AssociationEnd_packetT() {
        return this.elt.getTagValues(SwCommunicationResourceAssociationEnd.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_PACKETT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_AssociationEnd_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9db0d115-ba15-45d9-b6a0-e9b5338b2fa2")
    public String getSwCommunicationResource_AssociationEnd_speedFactor() {
        return this.elt.getTagValue(SwCommunicationResourceAssociationEnd.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_SPEEDFACTOR_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_AssociationEnd_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8acae456-3b51-4f68-b454-6e2b2260ea67")
    public String getSwCommunicationResource_AssociationEnd_transmMode() {
        return this.elt.getTagValue(SwCommunicationResourceAssociationEnd.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_TRANSMMODE_TAGTYPE_ELT);
    }

    @objid ("a3b4f367-999d-4197-b1e8-9c871613911d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_AssociationEnd_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7faba6a7-3675-4f0f-8a25-d2d3555f983c")
    public void setSwCommunicationResource_AssociationEnd_blockT(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceAssociationEnd.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_BLOCKT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_AssociationEnd_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cbd54bdb-10b7-4db9-bbeb-5e26a6e1c0bd")
    public void setSwCommunicationResource_AssociationEnd_capacity(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceAssociationEnd.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_CAPACITY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwCommunicationResource_AssociationEnd_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c8d3ebc4-5917-4c9e-bc88-c66f6b5170fb")
    public void setSwCommunicationResource_AssociationEnd_elementSize(final String value) {
        this.elt.putTagValue(SwCommunicationResourceAssociationEnd.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwCommunicationResource_AssociationEnd_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0a245961-5e3a-4152-82aa-addaf1cbd599")
    public void setSwCommunicationResource_AssociationEnd_mainScheduler(final String value) {
        this.elt.putTagValue(SwCommunicationResourceAssociationEnd.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_AssociationEnd_packetT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("aae01a12-929e-47dd-8693-a1d1a2becd75")
    public void setSwCommunicationResource_AssociationEnd_packetT(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceAssociationEnd.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_PACKETT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwCommunicationResource_AssociationEnd_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7dcce087-efd7-4eb9-aad0-3354db655f96")
    public void setSwCommunicationResource_AssociationEnd_speedFactor(final String value) {
        this.elt.putTagValue(SwCommunicationResourceAssociationEnd.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwCommunicationResource_AssociationEnd_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f8286287-2ee8-42fb-9ad2-d7c6b2799288")
    public void setSwCommunicationResource_AssociationEnd_transmMode(final String value) {
        this.elt.putTagValue(SwCommunicationResourceAssociationEnd.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_TRANSMMODE_TAGTYPE_ELT, value);
    }

    @objid ("3736688c-30d2-4c5b-82d3-d2ccf7be956b")
    protected SwCommunicationResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("8c45aa83-1c88-4383-bb6b-08b21cce3a77")
    public static final class MdaTypes {
        @objid ("883db471-aaa1-4421-96a5-3535298c6aa8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9f79ae46-ceaf-42e8-ab55-26744a1d3a2d")
        public static TagType SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_BLOCKT_TAGTYPE_ELT;

        @objid ("bed1ae06-2f98-41ce-b4ec-4b1aac14d4e2")
        public static TagType SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_PACKETT_TAGTYPE_ELT;

        @objid ("5b67b9ff-f11c-4d7a-b756-356073fa94aa")
        public static TagType SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_CAPACITY_TAGTYPE_ELT;

        @objid ("f8c24a0b-6501-44db-86e0-c5a77cd2e4ea")
        public static TagType SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_SPEEDFACTOR_TAGTYPE_ELT;

        @objid ("24ac19be-10bd-4642-8ac2-9a072b9bb0f7")
        public static TagType SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_MAINSCHEDULER_TAGTYPE_ELT;

        @objid ("7185e7d4-7cd2-4e16-a91c-8838c6c9b930")
        public static TagType SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("4e56fad8-a967-42f4-8a51-d4c7b0242e77")
        public static TagType SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_TRANSMMODE_TAGTYPE_ELT;

        @objid ("daf76667-4267-4fc5-891e-6683e8d05029")
        private static Stereotype MDAASSOCDEP;

        @objid ("c338bd85-2b1f-4d44-8681-c0423966df67")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d4fde9c6-bcc0-447c-83b2-755bd5ebae70")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0210d119-0ccf-11df-8525-001302895b2b");
            SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_BLOCKT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "84482869-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_PACKETT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "84482868-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "84482867-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_SPEEDFACTOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "84482866-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_MAINSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "84482865-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8978cb43-97f8-11e0-a4c3-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_TRANSMMODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "98bed97a-60ca-11e3-a828-0027103f347d");
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
