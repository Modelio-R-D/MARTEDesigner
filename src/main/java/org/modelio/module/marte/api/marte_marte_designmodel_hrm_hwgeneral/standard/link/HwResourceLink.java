/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.link;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.ResourceLink;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << HwResource_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("40d30ec4-3b81-4de1-bc67-9697c83666c7")
public class HwResourceLink extends ResourceLink {
    @objid ("5d92b42d-74fc-478b-b1a5-3f779a011a34")
    public static final String STEREOTYPE_NAME = "HwResource_Link";

    @objid ("5f3bf164-90ec-4d92-a3a7-3a7c923e9777")
    public static final String HWRESOURCE_LINK_DESCRIPTION_TAGTYPE = "HwResource_Link_description";

    @objid ("b97fc5de-2922-43e5-891a-cd5c43977567")
    public static final String HWRESOURCE_LINK_ENDPOINTS_TAGTYPE = "HwResource_Link_endPoints";

    @objid ("64395d55-b6c1-40e7-8014-582670ac9b5a")
    public static final String HWRESOURCE_LINK_FREQUENCY_TAGTYPE = "HwResource_Link_frequency";

    @objid ("b1b3d8fe-1c18-43dc-bc97-baf787fb4729")
    public static final String HWRESOURCE_LINK_OWNEDHW_TAGTYPE = "HwResource_Link_ownedHW";

    @objid ("a9f10569-ebb0-401b-9f63-6f3228409bcb")
    public static final String HWRESOURCE_LINK_P_HW_SERVICES_TAGTYPE = "HwResource_Link_p_HW_Services";

    @objid ("c704edc1-628c-42ae-8341-5b767c27249c")
    public static final String HWRESOURCE_LINK_R_HW_SERVICES_TAGTYPE = "HwResource_Link_r_HW_Services";

    /**
     * Tells whether a {@link HwResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwResource_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bb25d219-a99f-49ff-be65-184c3c58ce98")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwResource_Link >> then instantiate a {@link HwResourceLink} proxy.
     * 
     * @return a {@link HwResourceLink} proxy on the created {@link Link}.
     */
    @objid ("41f21ae8-b9a1-42ce-88bc-0ac0642b064a")
    public static HwResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceLink.STEREOTYPE_NAME);
        return HwResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwResourceLink} proxy from a {@link Link} stereotyped << HwResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwResourceLink} proxy or <i>null</i>.
     */
    @objid ("65fce814-ad2e-46e2-a838-181f8997577e")
    public static HwResourceLink instantiate(final Link obj) {
        return HwResourceLink.canInstantiate(obj) ? new HwResourceLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwResourceLink} proxy from a {@link Link} stereotyped << HwResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link HwResourceLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9f038924-de8f-40b2-a645-88bbc6dbea30")
    public static HwResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwResourceLink.canInstantiate(obj))
        	return new HwResourceLink(obj);
        else
        	throw new IllegalArgumentException("HwResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("541ef18d-ddb7-4d3d-881e-412b7d686d0c")
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
        HwResourceLink other = (HwResourceLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("afc0eee6-6418-4c6b-9c0a-ccee235b197a")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'HwResource_Link_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5d569c11-f841-444c-aaa0-3e662a585116")
    public String getHwResource_Link_description() {
        return this.elt.getTagValue(HwResourceLink.MdaTypes.HWRESOURCE_LINK_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Link_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3b1fbf10-bb8f-4cd7-941b-d35b7c858074")
    public List<String> getHwResource_Link_endPoints() {
        return this.elt.getTagValues(HwResourceLink.MdaTypes.HWRESOURCE_LINK_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwResource_Link_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c22a17db-dfe4-4fec-b1bd-ac25ab32c21c")
    public String getHwResource_Link_frequency() {
        return this.elt.getTagValue(HwResourceLink.MdaTypes.HWRESOURCE_LINK_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Link_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("dfe70535-497a-4353-8211-bf6506295f0a")
    public List<String> getHwResource_Link_ownedHW() {
        return this.elt.getTagValues(HwResourceLink.MdaTypes.HWRESOURCE_LINK_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Link_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("69aa7805-4cb8-4798-a4e8-d69070eb5b83")
    public List<String> getHwResource_Link_p_HW_Services() {
        return this.elt.getTagValues(HwResourceLink.MdaTypes.HWRESOURCE_LINK_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Link_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("232e04a2-cb24-40f7-9975-30c48629eda1")
    public List<String> getHwResource_Link_r_HW_Services() {
        return this.elt.getTagValues(HwResourceLink.MdaTypes.HWRESOURCE_LINK_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("568dfbed-3d02-4a1f-a8c6-1059a96e4e12")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwResource_Link_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e1a19ce9-daba-42e1-8260-570526a4e491")
    public void setHwResource_Link_description(final String value) {
        this.elt.putTagValue(HwResourceLink.MdaTypes.HWRESOURCE_LINK_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwResource_Link_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("53ac170a-6b01-4bd4-8bcd-5db5c25dbf4e")
    public void setHwResource_Link_endPoints(final List<String> values) {
        this.elt.putTagValues(HwResourceLink.MdaTypes.HWRESOURCE_LINK_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwResource_Link_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f34ae09a-1362-4082-b02d-1c1be0284511")
    public void setHwResource_Link_frequency(final String value) {
        this.elt.putTagValue(HwResourceLink.MdaTypes.HWRESOURCE_LINK_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwResource_Link_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0349907e-de72-4628-bd57-1094ed1458f4")
    public void setHwResource_Link_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwResourceLink.MdaTypes.HWRESOURCE_LINK_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwResource_Link_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9b890709-008a-4bda-803b-787271a33ae6")
    public void setHwResource_Link_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwResourceLink.MdaTypes.HWRESOURCE_LINK_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwResource_Link_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("76e94885-def7-41f6-b495-270245910e6d")
    public void setHwResource_Link_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwResourceLink.MdaTypes.HWRESOURCE_LINK_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("0a0d58fa-87a8-4fce-863f-1849343d1548")
    protected HwResourceLink(final Link elt) {
        super(elt);
    }

    @objid ("8c972adf-4c76-4d14-a898-f0fde218b082")
    public static final class MdaTypes {
        @objid ("b546534b-3920-4ab8-b363-05cf48d3e47d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b6167b96-ebe0-4b15-8400-172842161465")
        public static TagType HWRESOURCE_LINK_DESCRIPTION_TAGTYPE_ELT;

        @objid ("9156bd91-9954-44cc-82c8-6c74ab0809ac")
        public static TagType HWRESOURCE_LINK_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("b2cfb86b-5353-463a-a964-692159bda880")
        public static TagType HWRESOURCE_LINK_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("a991f59d-b3e2-4218-9615-4bd71a7f50cb")
        public static TagType HWRESOURCE_LINK_OWNEDHW_TAGTYPE_ELT;

        @objid ("2d4a7425-1afa-41fd-99ae-ac4626797db4")
        public static TagType HWRESOURCE_LINK_FREQUENCY_TAGTYPE_ELT;

        @objid ("4d4af210-a9db-4099-b81e-f6a352a3943b")
        public static TagType HWRESOURCE_LINK_ENDPOINTS_TAGTYPE_ELT;

        @objid ("95b67cd4-f4a0-4a2b-9aed-a87827c24ae6")
        private static Stereotype MDAASSOCDEP;

        @objid ("1491b767-6309-4dc0-a099-b8988233012c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("71c2c61f-b440-4585-8aae-6b535e31894f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00dae378-0ccf-11df-8525-001302895b2b");
            HWRESOURCE_LINK_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "019bff68-0ccf-11df-8525-001302895b2b");
            HWRESOURCE_LINK_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "019bff6f-0ccf-11df-8525-001302895b2b");
            HWRESOURCE_LINK_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "019bff76-0ccf-11df-8525-001302895b2b");
            HWRESOURCE_LINK_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "019bff7d-0ccf-11df-8525-001302895b2b");
            HWRESOURCE_LINK_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cfa443f6-1013-11df-86fe-0014222a9f79");
            HWRESOURCE_LINK_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "2e52d5bb-1709-11df-b92a-0014222a9f79");
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
