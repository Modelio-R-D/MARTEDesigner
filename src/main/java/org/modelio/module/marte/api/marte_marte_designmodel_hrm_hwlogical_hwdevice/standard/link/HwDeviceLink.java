/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.link;

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
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.link.HwResourceLink;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << HwDevice_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("9965ac96-e705-46cd-b626-0edcaa796462")
public class HwDeviceLink extends HwResourceLink {
    @objid ("a1d3a63d-ca07-4617-a76e-8791ac0a570c")
    public static final String STEREOTYPE_NAME = "HwDevice_Link";

    @objid ("38f236e1-b92c-4d97-ba15-f76f63d73603")
    public static final String HWDEVICE_LINK_MAINSCHEDULER_TAGTYPE = "HwDevice_Link_mainScheduler";

    @objid ("c091dd1a-6006-47f5-b010-cfc5fc0c663e")
    public static final String HWDEVICE_LINK_SPEEDFACTOR_TAGTYPE = "HwDevice_Link_speedFactor";

    /**
     * Tells whether a {@link HwDeviceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwDevice_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("cf13b5f7-7b40-4966-9114-ab6f8d66b2f7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDeviceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwDevice_Link >> then instantiate a {@link HwDeviceLink} proxy.
     * 
     * @return a {@link HwDeviceLink} proxy on the created {@link Link}.
     */
    @objid ("64d20def-dad2-4a26-b42b-ae2f058368a2")
    public static HwDeviceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwDeviceLink.STEREOTYPE_NAME);
        return HwDeviceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwDeviceLink} proxy from a {@link Link} stereotyped << HwDevice_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwDeviceLink} proxy or <i>null</i>.
     */
    @objid ("e3f26a7c-a479-4734-a51c-ecbeeb9eae41")
    public static HwDeviceLink instantiate(final Link obj) {
        return HwDeviceLink.canInstantiate(obj) ? new HwDeviceLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwDeviceLink} proxy from a {@link Link} stereotyped << HwDevice_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link HwDeviceLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2411ff98-b1b5-4b5e-813f-23d82d9dad21")
    public static HwDeviceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwDeviceLink.canInstantiate(obj))
        	return new HwDeviceLink(obj);
        else
        	throw new IllegalArgumentException("HwDeviceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6488afe4-dd5d-4d47-a44b-64a3fc058414")
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
        HwDeviceLink other = (HwDeviceLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("b0914bd3-9e06-4f63-ac5e-ea6881018829")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'HwDevice_Link_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("492a8c57-9a7b-4ed8-accd-fb57949acfa3")
    public String getHwDevice_Link_mainScheduler() {
        return this.elt.getTagValue(HwDeviceLink.MdaTypes.HWDEVICE_LINK_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDevice_Link_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ccd25ce8-1f9a-498b-a5b2-c98bc16f06ef")
    public String getHwDevice_Link_speedFactor() {
        return this.elt.getTagValue(HwDeviceLink.MdaTypes.HWDEVICE_LINK_SPEEDFACTOR_TAGTYPE_ELT);
    }

    @objid ("d2929a51-3e8b-4052-9923-7099ee51eec6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwDevice_Link_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1501bb86-101b-4c19-ba98-74414c6f1c67")
    public void setHwDevice_Link_mainScheduler(final String value) {
        this.elt.putTagValue(HwDeviceLink.MdaTypes.HWDEVICE_LINK_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDevice_Link_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d4e869ea-055e-4e60-a276-3f8aae05cf69")
    public void setHwDevice_Link_speedFactor(final String value) {
        this.elt.putTagValue(HwDeviceLink.MdaTypes.HWDEVICE_LINK_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    @objid ("8be9fdd2-2c85-4f7a-8a71-034f55f86b2f")
    protected HwDeviceLink(final Link elt) {
        super(elt);
    }

    @objid ("c50562fa-45c4-4ea0-871c-c6662a0413bf")
    public static final class MdaTypes {
        @objid ("94182bc9-9b2b-4666-8b78-a4113f921f26")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("29925cff-3d56-4fe3-bc24-e5e552e68e02")
        public static TagType HWDEVICE_LINK_SPEEDFACTOR_TAGTYPE_ELT;

        @objid ("8ce11734-76f0-4143-a350-5e1be3bd2d70")
        public static TagType HWDEVICE_LINK_MAINSCHEDULER_TAGTYPE_ELT;

        @objid ("dadb63c6-f91d-4405-bc95-7895070e1031")
        private static Stereotype MDAASSOCDEP;

        @objid ("f2b8669e-c3fa-4cef-8d9a-90ad4d14a47f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("01325574-54d7-49bd-93c3-41d6e45022e8")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0130b701-0ccf-11df-8525-001302895b2b");
            HWDEVICE_LINK_SPEEDFACTOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "54591ebe-92ab-11e0-a69d-0027103f347c");
            HWDEVICE_LINK_MAINSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "54591ebf-92ab-11e0-a69d-0027103f347c");
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
