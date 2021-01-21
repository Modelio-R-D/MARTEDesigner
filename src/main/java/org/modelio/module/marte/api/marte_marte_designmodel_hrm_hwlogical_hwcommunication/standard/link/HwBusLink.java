/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("79b1e413-8211-47b4-9146-9eb87e244fe3")
    public static final String STEREOTYPE_NAME = "HwBus_Link";

    @objid ("45948118-624d-466d-9857-aaef126ff218")
    public static final String HWBUS_LINK_ADRESSWIDTH_TAGTYPE = "HwBus_Link_adressWidth";

    @objid ("2132cbf4-e10c-4394-822d-a64cbefaef73")
    public static final String HWBUS_LINK_ISSERIAL_TAGTYPE = "HwBus_Link_isSerial";

    @objid ("c0fe94eb-2d86-41bf-af04-43acf58c848e")
    public static final String HWBUS_LINK_ISSYNCHRONOUS_TAGTYPE = "HwBus_Link_isSynchronous";

    @objid ("084e62e7-b3f6-4c7f-bd68-1eab76270f54")
    public static final String HWBUS_LINK_WORDWIDTH_TAGTYPE = "HwBus_Link_wordWidth";

    /**
     * Tells whether a {@link HwBusLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwBus_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("bf20612a-4116-4694-97fa-5048b2df1146")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBusLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwBus_Link >> then instantiate a {@link HwBusLink} proxy.
     * 
     * @return a {@link HwBusLink} proxy on the created {@link Link}.
     */
    @objid ("f588ba5f-03d4-45cd-9455-20348d53ce94")
    public static HwBusLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBusLink.STEREOTYPE_NAME);
        return HwBusLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwBusLink} proxy from a {@link Link} stereotyped << HwBus_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwBusLink} proxy or <i>null</i>.
     */
    @objid ("eb80fa0d-91fc-481a-8549-befff6cae689")
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
    @objid ("8024159a-c42b-473a-b17e-27b4ae17a1a4")
    public static HwBusLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwBusLink.canInstantiate(obj))
        	return new HwBusLink(obj);
        else
        	throw new IllegalArgumentException("HwBusLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8aab1e10-bd38-4ba7-800f-e9c69a5c400f")
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
    @objid ("67ef6eaa-2fa0-4bcd-980d-1d158deba968")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'HwBus_Link_adressWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bfb67e3c-0495-43f6-b799-8015e4c9a758")
    public String getHwBus_Link_adressWidth() {
        return this.elt.getTagValue(HwBusLink.MdaTypes.HWBUS_LINK_ADRESSWIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwBus_Link_wordWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("811662e2-56d4-4c6d-960e-2a6f5b4a56cc")
    public String getHwBus_Link_wordWidth() {
        return this.elt.getTagValue(HwBusLink.MdaTypes.HWBUS_LINK_WORDWIDTH_TAGTYPE_ELT);
    }

    @objid ("c9a4b9b2-813b-463c-8e93-562e1bd6f36d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwBus_Link_isSerial'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8d668727-bd9a-4395-ac95-f4789636ddbc")
    public boolean isHwBus_Link_isSerial() {
        return this.elt.isTagged(HwBusLink.MdaTypes.HWBUS_LINK_ISSERIAL_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwBus_Link_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7c219052-3e29-4aed-96a0-9999c2a35185")
    public boolean isHwBus_Link_isSynchronous() {
        return this.elt.isTagged(HwBusLink.MdaTypes.HWBUS_LINK_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwBus_Link_adressWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c1f3f7d5-552d-44a0-8050-117fe1924654")
    public void setHwBus_Link_adressWidth(final String value) {
        this.elt.putTagValue(HwBusLink.MdaTypes.HWBUS_LINK_ADRESSWIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'HwBus_Link_isSerial'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2e05fb48-03ed-4f70-af75-b604130ec5a2")
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
    @objid ("eedc0908-b019-45ec-be84-05eeed757962")
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
    @objid ("667b82b4-bc2c-406e-b78c-26e8ef464f82")
    public void setHwBus_Link_wordWidth(final String value) {
        this.elt.putTagValue(HwBusLink.MdaTypes.HWBUS_LINK_WORDWIDTH_TAGTYPE_ELT, value);
    }

    @objid ("beb3e5e6-20ed-40c6-8218-aedf03e4bfba")
    protected HwBusLink(final Link elt) {
        super(elt);
    }

    @objid ("e61c4c40-6371-4ce1-a46b-7f22f58304d5")
    public static final class MdaTypes {
        @objid ("e794a431-e04e-4e4c-94aa-e993b4451e2d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("44d9a56f-204b-437b-9936-77ad082c4032")
        public static TagType HWBUS_LINK_ADRESSWIDTH_TAGTYPE_ELT;

        @objid ("eb2c8a6e-83c2-4749-b6b5-d462a5ba8a1d")
        public static TagType HWBUS_LINK_WORDWIDTH_TAGTYPE_ELT;

        @objid ("2d7d4efc-f6db-4e36-961a-048d4f84ea3f")
        public static TagType HWBUS_LINK_ISSYNCHRONOUS_TAGTYPE_ELT;

        @objid ("07d5f035-83b7-45e2-a7c8-4eaa44646330")
        public static TagType HWBUS_LINK_ISSERIAL_TAGTYPE_ELT;

        @objid ("446ec007-c0b4-47b6-b517-acb77052de60")
        private static Stereotype MDAASSOCDEP;

        @objid ("8efb2696-6915-4a5e-8c84-a18df67559b7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("be664ffc-8063-4219-a578-cfa697dda4fb")
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
