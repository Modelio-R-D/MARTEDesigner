/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("84d9c5e3-01d8-44fe-878b-aadb765fd30e")
    public static final String STEREOTYPE_NAME = "HwResource_Link";

    @objid ("c1979eb4-f01e-4634-beb1-519e1b7e82e9")
    public static final String HWRESOURCE_LINK_DESCRIPTION_TAGTYPE = "HwResource_Link_description";

    @objid ("32dc9711-8370-466c-889a-3bfd38e17e48")
    public static final String HWRESOURCE_LINK_ENDPOINTS_TAGTYPE = "HwResource_Link_endPoints";

    @objid ("88d38777-9204-464c-83d4-a33aa4561e9b")
    public static final String HWRESOURCE_LINK_FREQUENCY_TAGTYPE = "HwResource_Link_frequency";

    @objid ("61afbda9-5ba1-4f16-aa5a-ca1bbb9e9680")
    public static final String HWRESOURCE_LINK_OWNEDHW_TAGTYPE = "HwResource_Link_ownedHW";

    @objid ("05a73620-2e07-4fd7-84ee-f50bb6cf4192")
    public static final String HWRESOURCE_LINK_P_HW_SERVICES_TAGTYPE = "HwResource_Link_p_HW_Services";

    @objid ("cd325de4-0aad-46c0-a6f7-efc0456888e4")
    public static final String HWRESOURCE_LINK_R_HW_SERVICES_TAGTYPE = "HwResource_Link_r_HW_Services";

    /**
     * Tells whether a {@link HwResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwResource_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("dc01c6c4-d699-4322-82b3-649102faa0ab")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwResource_Link >> then instantiate a {@link HwResourceLink} proxy.
     * 
     * @return a {@link HwResourceLink} proxy on the created {@link Link}.
     */
    @objid ("0420ff26-5542-4e10-b658-2cfe5f052372")
    public static HwResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceLink.STEREOTYPE_NAME);
        return HwResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwResourceLink} proxy from a {@link Link} stereotyped << HwResource_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwResourceLink} proxy or <i>null</i>.
     */
    @objid ("e1da1832-5985-49dc-bd2d-e567db5900fd")
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
    @objid ("7ee2a68f-fff9-4f8d-b76d-d4d8ef7b9fbf")
    public static HwResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwResourceLink.canInstantiate(obj))
        	return new HwResourceLink(obj);
        else
        	throw new IllegalArgumentException("HwResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3cc1bde7-6cc4-4f82-a74c-a9a3b32d863c")
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
    @objid ("f962a773-5f1e-4ad7-8821-b5c9a1f756ea")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'HwResource_Link_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e80cf5e5-4c3b-4809-9f9b-953173094a25")
    public String getHwResource_Link_description() {
        return this.elt.getTagValue(HwResourceLink.MdaTypes.HWRESOURCE_LINK_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Link_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4c33f090-d1b6-4dde-b648-7338c7d8c1d9")
    public List<String> getHwResource_Link_endPoints() {
        return this.elt.getTagValues(HwResourceLink.MdaTypes.HWRESOURCE_LINK_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwResource_Link_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("14aab933-88b1-4984-aff6-ec1a1769e972")
    public String getHwResource_Link_frequency() {
        return this.elt.getTagValue(HwResourceLink.MdaTypes.HWRESOURCE_LINK_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Link_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("00ff12c9-4b04-4866-98a1-be814fedfa37")
    public List<String> getHwResource_Link_ownedHW() {
        return this.elt.getTagValues(HwResourceLink.MdaTypes.HWRESOURCE_LINK_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Link_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f0eb05a4-13a7-4c6a-bbee-a75acbd2f079")
    public List<String> getHwResource_Link_p_HW_Services() {
        return this.elt.getTagValues(HwResourceLink.MdaTypes.HWRESOURCE_LINK_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Link_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ae6b7fb6-5719-4ad5-aab7-7defd3258e08")
    public List<String> getHwResource_Link_r_HW_Services() {
        return this.elt.getTagValues(HwResourceLink.MdaTypes.HWRESOURCE_LINK_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("5cf95898-1089-42be-9e5f-60a09558ad29")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwResource_Link_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("11b300f5-68c8-4e06-9472-c11885797eb4")
    public void setHwResource_Link_description(final String value) {
        this.elt.putTagValue(HwResourceLink.MdaTypes.HWRESOURCE_LINK_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwResource_Link_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b39eadf2-362e-4a56-bb08-5596009347c2")
    public void setHwResource_Link_endPoints(final List<String> values) {
        this.elt.putTagValues(HwResourceLink.MdaTypes.HWRESOURCE_LINK_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwResource_Link_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("403980e1-54c6-46ee-b7fc-f98a5e3c830e")
    public void setHwResource_Link_frequency(final String value) {
        this.elt.putTagValue(HwResourceLink.MdaTypes.HWRESOURCE_LINK_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwResource_Link_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("df6c3f58-0dac-4d0f-8138-ea53268f8cb7")
    public void setHwResource_Link_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwResourceLink.MdaTypes.HWRESOURCE_LINK_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwResource_Link_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0f544c1e-d3e3-4eeb-9019-f5f1c8ebb535")
    public void setHwResource_Link_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwResourceLink.MdaTypes.HWRESOURCE_LINK_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwResource_Link_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7b4c7826-c05c-4d8d-8cdd-a7ec42a0dc26")
    public void setHwResource_Link_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwResourceLink.MdaTypes.HWRESOURCE_LINK_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("efc4298a-c19f-445e-a676-15db84a0fd6d")
    protected HwResourceLink(final Link elt) {
        super(elt);
    }

    @objid ("8c972adf-4c76-4d14-a898-f0fde218b082")
    public static final class MdaTypes {
        @objid ("cfa89cf0-7b2c-43cf-9662-6a202e22cd87")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6d25ed64-e92d-40f5-b971-44acb211149b")
        public static TagType HWRESOURCE_LINK_DESCRIPTION_TAGTYPE_ELT;

        @objid ("da76dd91-d6c0-49b9-a4a9-832f37ba5ac0")
        public static TagType HWRESOURCE_LINK_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("ae664fda-dd07-4f09-bcb5-7facb36a05b6")
        public static TagType HWRESOURCE_LINK_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("95bff60e-a089-4b9b-83bd-744606fda8ed")
        public static TagType HWRESOURCE_LINK_OWNEDHW_TAGTYPE_ELT;

        @objid ("a6bc66e0-d31b-49b8-849b-9b3c8485ceed")
        public static TagType HWRESOURCE_LINK_FREQUENCY_TAGTYPE_ELT;

        @objid ("20243da5-9014-411d-902b-5ec4500e7af3")
        public static TagType HWRESOURCE_LINK_ENDPOINTS_TAGTYPE_ELT;

        @objid ("11c33858-cb84-49b0-8d70-f37d03bb371d")
        private static Stereotype MDAASSOCDEP;

        @objid ("706d666c-745a-4df8-a103-95480017a61d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("803fe0ea-0239-4a83-a8fe-ad8e53565f48")
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
