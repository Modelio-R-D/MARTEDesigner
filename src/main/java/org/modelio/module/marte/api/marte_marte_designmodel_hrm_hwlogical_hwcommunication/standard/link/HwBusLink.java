/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.link;

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
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << HwBus_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("7af9e231-e1de-47d4-a962-bee64347ecc7")
public class HwBusLink extends HwMediaLink {
    @objid ("e509dd72-ad9b-41b5-bfb2-11d31e435d1c")
    public static final String STEREOTYPE_NAME = "HwBus_Link";

    @objid ("27e278ba-c7c1-4776-b25d-b574dc8b77de")
    public static final String HWBUS_LINK_ADRESSWIDTH_TAGTYPE = "HwBus_Link_adressWidth";

    @objid ("f33a78cf-01b8-4efe-97c4-5e9cab8756c0")
    public static final String HWBUS_LINK_ISSERIAL_TAGTYPE = "HwBus_Link_isSerial";

    @objid ("fb62083e-d571-4a0e-80e2-4c52955f2e77")
    public static final String HWBUS_LINK_ISSYNCHRONOUS_TAGTYPE = "HwBus_Link_isSynchronous";

    @objid ("8923473e-6ef2-46ad-aead-3fd44c656934")
    public static final String HWBUS_LINK_WORDWIDTH_TAGTYPE = "HwBus_Link_wordWidth";

    /**
     * Tells whether a {@link HwBusLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwBus_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("fbebb79a-49ed-49c9-97ac-afad16507a27")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBusLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwBus_Link >> then instantiate a {@link HwBusLink} proxy.
     * 
     * @return a {@link HwBusLink} proxy on the created {@link Link}.
     */
    @objid ("db39d100-8bce-479a-9019-74f6ce4eb431")
    public static HwBusLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBusLink.STEREOTYPE_NAME);
        return HwBusLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwBusLink} proxy from a {@link Link} stereotyped << HwBus_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwBusLink} proxy or <i>null</i>.
     */
    @objid ("03f0995a-7a57-4de9-9c85-bfd8518834c2")
    public static HwBusLink instantiate(final Link obj) {
        return HwBusLink.canInstantiate(obj) ? new HwBusLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwBusLink} proxy from a {@link Link} stereotyped << HwBus_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link HwBusLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1a3b29e7-e922-4b7b-a1d8-43424b739e79")
    public static HwBusLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwBusLink.canInstantiate(obj))
        	return new HwBusLink(obj);
        else
        	throw new IllegalArgumentException("HwBusLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6e5076dc-18c5-4d8a-8f1c-640523acfe08")
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
        HwBusLink other = (HwBusLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("97c5100e-9198-4650-984f-abd518db33f6")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'HwBus_Link_adressWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5d283d25-3852-426f-bfad-5d028c377ac5")
    public String getHwBus_Link_adressWidth() {
        return this.elt.getTagValue(HwBusLink.MdaTypes.HWBUS_LINK_ADRESSWIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwBus_Link_wordWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e1348f10-300e-4454-9a9c-b1e786e1ca69")
    public String getHwBus_Link_wordWidth() {
        return this.elt.getTagValue(HwBusLink.MdaTypes.HWBUS_LINK_WORDWIDTH_TAGTYPE_ELT);
    }

    @objid ("646e32ab-3c90-4c3c-954f-a6294b898cc6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwBus_Link_isSerial'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3095abc3-ecb5-4e18-858a-ec3295d2dc53")
    public boolean isHwBus_Link_isSerial() {
        return this.elt.isTagged(HwBusLink.MdaTypes.HWBUS_LINK_ISSERIAL_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwBus_Link_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b0fe742e-fffd-4612-a877-90164aeae854")
    public boolean isHwBus_Link_isSynchronous() {
        return this.elt.isTagged(HwBusLink.MdaTypes.HWBUS_LINK_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwBus_Link_adressWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8e347f33-5bc8-48b9-b5bd-ac2d5a4b2a21")
    public void setHwBus_Link_adressWidth(final String value) {
        this.elt.putTagValue(HwBusLink.MdaTypes.HWBUS_LINK_ADRESSWIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'HwBus_Link_isSerial'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("70ce0750-ed4e-41b3-ac38-b8b2f57f8f82")
    public void setHwBus_Link_isSerial(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwBusLink.MdaTypes.HWBUS_LINK_ISSERIAL_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwBusLink.MdaTypes.HWBUS_LINK_ISSERIAL_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwBus_Link_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("30c3baaf-9198-4260-b5ca-2714ae2f332b")
    public void setHwBus_Link_isSynchronous(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwBusLink.MdaTypes.HWBUS_LINK_ISSYNCHRONOUS_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwBusLink.MdaTypes.HWBUS_LINK_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwBus_Link_wordWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d329aae8-cf94-4a54-94f6-e224012feffa")
    public void setHwBus_Link_wordWidth(final String value) {
        this.elt.putTagValue(HwBusLink.MdaTypes.HWBUS_LINK_WORDWIDTH_TAGTYPE_ELT, value);
    }

    @objid ("2a1fa823-2d21-428a-b418-aa711220e060")
    protected HwBusLink(final Link elt) {
        super(elt);
    }

    @objid ("e61c4c40-6371-4ce1-a46b-7f22f58304d5")
    public static final class MdaTypes {
        @objid ("5ea2fae6-5831-4af5-8c2c-7e8f56858bda")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("35d5f887-fddf-4cbf-9e82-331c4a787bd0")
        public static TagType HWBUS_LINK_ADRESSWIDTH_TAGTYPE_ELT;

        @objid ("c36f5a3f-f6bd-445a-8578-844be138533a")
        public static TagType HWBUS_LINK_WORDWIDTH_TAGTYPE_ELT;

        @objid ("00392fe5-1447-46fd-9510-db017adbf9a0")
        public static TagType HWBUS_LINK_ISSYNCHRONOUS_TAGTYPE_ELT;

        @objid ("33b93f24-d833-463c-a8c7-da866a5d2e3b")
        public static TagType HWBUS_LINK_ISSERIAL_TAGTYPE_ELT;

        @objid ("bb9e2b39-6492-4a7f-a67e-001b6fb5140f")
        private static Stereotype MDAASSOCDEP;

        @objid ("230e6b12-b007-40a3-8d54-485ee541b5ca")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e25e8b49-ea18-4f69-8a9d-8846d5a50d74")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01167d7b-0ccf-11df-8525-001302895b2b");
            HWBUS_LINK_ADRESSWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01167d82-0ccf-11df-8525-001302895b2b");
            HWBUS_LINK_WORDWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01167d89-0ccf-11df-8525-001302895b2b");
            HWBUS_LINK_ISSYNCHRONOUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9b356dbd-1707-11df-b92a-0014222a9f79");
            HWBUS_LINK_ISSERIAL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9b356dbe-1707-11df-b92a-0014222a9f79");
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
