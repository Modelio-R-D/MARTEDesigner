/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.link;

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
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.CommunicationEndPointLink;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << HwEndPoint_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("0d6287d3-9e3c-4f33-acbf-5eaa8fa88f05")
public class HwEndPointLink extends CommunicationEndPointLink {
    @objid ("24e32a48-e50b-4ccc-9f56-3e5baf4a4d48")
    public static final String STEREOTYPE_NAME = "HwEndPoint_Link";

    @objid ("75c2dc38-456d-4097-b4d7-0e9928acf507")
    public static final String HWENDPOINT_LINK_CONNECTEDTO_TAGTYPE = "HwEndPoint_Link_connectedTo";

    @objid ("e3d16f8e-2e7e-4faf-b975-ed830747a0f5")
    public static final String HWENDPOINT_LINK_DESCRIPTION_TAGTYPE = "HwEndPoint_Link_description";

    @objid ("74a22865-5398-4cb4-b70e-2c5cdea36285")
    public static final String HWENDPOINT_LINK_FREQUENCY_TAGTYPE = "HwEndPoint_Link_frequency";

    @objid ("787ce5ca-0f01-4758-b426-187339d8e1d6")
    public static final String HWENDPOINT_LINK_OWNEDHW_TAGTYPE = "HwEndPoint_Link_ownedHW";

    @objid ("ab5b5a53-51c4-49e0-a85f-252e202ccc2e")
    public static final String HWENDPOINT_LINK_P_HW_SERVICES_TAGTYPE = "HwEndPoint_Link_p_HW_Services";

    @objid ("abd0a734-4ea7-49f0-bdf6-febe645d148d")
    public static final String HWENDPOINT_LINK_R_HW_SERVICES_TAGTYPE = "HwEndPoint_Link_r_HW_Services";

    /**
     * Tells whether a {@link HwEndPointLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwEndPoint_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("1d683f69-5c4c-497a-8030-10ec5ddd908b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwEndPointLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwEndPoint_Link >> then instantiate a {@link HwEndPointLink} proxy.
     * 
     * @return a {@link HwEndPointLink} proxy on the created {@link Link}.
     */
    @objid ("9a84253a-7631-4963-93fe-178d3cc57bb6")
    public static HwEndPointLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwEndPointLink.STEREOTYPE_NAME);
        return HwEndPointLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwEndPointLink} proxy from a {@link Link} stereotyped << HwEndPoint_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwEndPointLink} proxy or <i>null</i>.
     */
    @objid ("9cc63e7e-a17b-4208-8ed5-0378e886027a")
    public static HwEndPointLink instantiate(final Link obj) {
        return HwEndPointLink.canInstantiate(obj) ? new HwEndPointLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwEndPointLink} proxy from a {@link Link} stereotyped << HwEndPoint_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link HwEndPointLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4f911913-b6fe-499e-86d6-d575a3417e27")
    public static HwEndPointLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwEndPointLink.canInstantiate(obj))
        	return new HwEndPointLink(obj);
        else
        	throw new IllegalArgumentException("HwEndPointLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("91279028-94a0-4c52-b397-4d0452885a89")
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
        HwEndPointLink other = (HwEndPointLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("3cab8acc-de03-49b1-9b1c-de6d3b028cef")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Link_connectedTo'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("58c1866e-a094-4ca1-a5dc-e082c3eea5ef")
    public List<String> getHwEndPoint_Link_connectedTo() {
        return this.elt.getTagValues(HwEndPointLink.MdaTypes.HWENDPOINT_LINK_CONNECTEDTO_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwEndPoint_Link_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6b5016c2-9447-43e0-90fc-c37196fbd9cd")
    public String getHwEndPoint_Link_description() {
        return this.elt.getTagValue(HwEndPointLink.MdaTypes.HWENDPOINT_LINK_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwEndPoint_Link_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0b2bcc53-9622-410d-92e2-f764a0630cdd")
    public String getHwEndPoint_Link_frequency() {
        return this.elt.getTagValue(HwEndPointLink.MdaTypes.HWENDPOINT_LINK_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Link_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6ea8e9d2-b848-4df5-9c1e-ca4b8bc643fe")
    public List<String> getHwEndPoint_Link_ownedHW() {
        return this.elt.getTagValues(HwEndPointLink.MdaTypes.HWENDPOINT_LINK_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Link_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("58a14be8-aa7c-4f6d-b241-0681a807def6")
    public List<String> getHwEndPoint_Link_p_HW_Services() {
        return this.elt.getTagValues(HwEndPointLink.MdaTypes.HWENDPOINT_LINK_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Link_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4c8624cc-f195-4e63-84d8-56cfe4493746")
    public List<String> getHwEndPoint_Link_r_HW_Services() {
        return this.elt.getTagValues(HwEndPointLink.MdaTypes.HWENDPOINT_LINK_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("4ff9e093-0aab-4fa2-b9ec-c07995c33459")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Link_connectedTo'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("28c4ee07-fb64-4748-9c0d-d1bb1d205ac3")
    public void setHwEndPoint_Link_connectedTo(final List<String> values) {
        this.elt.putTagValues(HwEndPointLink.MdaTypes.HWENDPOINT_LINK_CONNECTEDTO_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwEndPoint_Link_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a6c7a5d0-c14e-4676-a67f-2bafab002e5e")
    public void setHwEndPoint_Link_description(final String value) {
        this.elt.putTagValue(HwEndPointLink.MdaTypes.HWENDPOINT_LINK_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwEndPoint_Link_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f22bfe4e-f4c4-4470-bf77-950cda789b56")
    public void setHwEndPoint_Link_frequency(final String value) {
        this.elt.putTagValue(HwEndPointLink.MdaTypes.HWENDPOINT_LINK_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Link_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("eab8e012-32ee-4be4-b282-f9388845ea89")
    public void setHwEndPoint_Link_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwEndPointLink.MdaTypes.HWENDPOINT_LINK_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Link_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("669d039a-788c-4d22-8121-d1758360d3f8")
    public void setHwEndPoint_Link_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwEndPointLink.MdaTypes.HWENDPOINT_LINK_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Link_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ef4f29b6-151a-45e5-b768-63cc323f0e9c")
    public void setHwEndPoint_Link_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwEndPointLink.MdaTypes.HWENDPOINT_LINK_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("1ca3d497-3768-4358-968d-06498187fe21")
    protected HwEndPointLink(final Link elt) {
        super(elt);
    }

    @objid ("4a41a58f-96b1-4a87-9a6f-92f01085c67c")
    public static final class MdaTypes {
        @objid ("a08edd2c-a91c-4538-93ef-795f5112c084")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ba1adedb-1296-46a4-93ea-7f53cf42b160")
        public static TagType HWENDPOINT_LINK_CONNECTEDTO_TAGTYPE_ELT;

        @objid ("4e99e507-36f5-4485-b619-bc202632a922")
        public static TagType HWENDPOINT_LINK_DESCRIPTION_TAGTYPE_ELT;

        @objid ("d422e702-fe89-408c-ac5c-d2be3c61c553")
        public static TagType HWENDPOINT_LINK_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("0577dbb2-893b-4ac1-b8b2-54e7d196fd2c")
        public static TagType HWENDPOINT_LINK_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("ee000c35-5bbe-4618-ac3b-0190e4238500")
        public static TagType HWENDPOINT_LINK_OWNEDHW_TAGTYPE_ELT;

        @objid ("53697805-ef28-4dd8-bf86-1f6b6cb0d57e")
        public static TagType HWENDPOINT_LINK_FREQUENCY_TAGTYPE_ELT;

        @objid ("433122c3-84d7-4658-9370-6927fcbd604e")
        private static Stereotype MDAASSOCDEP;

        @objid ("e085ce53-6f88-4696-8d21-d2f065c4fdb1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5ef2857f-97b4-4b70-9414-05ec503b9202")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "010cf432-0ccf-11df-8525-001302895b2b");
            HWENDPOINT_LINK_CONNECTEDTO_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e9bdb0c1-1726-11df-b92a-0014222a9f79");
            HWENDPOINT_LINK_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4e9a91fe-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_LINK_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4e9a91ff-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_LINK_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4e9ab90f-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_LINK_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4e9ab910-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_LINK_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4e9ab911-92a9-11e0-a69d-0027103f347c");
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
