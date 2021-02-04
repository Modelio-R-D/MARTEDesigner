/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("499a2b66-7672-4c03-94ce-016587b20c4a")
    public static final String STEREOTYPE_NAME = "HwDevice_Link";

    @objid ("53ed7033-e469-417f-a2b9-96cd5599390c")
    public static final String HWDEVICE_LINK_MAINSCHEDULER_TAGTYPE = "HwDevice_Link_mainScheduler";

    @objid ("ce4fb3fb-853a-4253-9061-b78578b158af")
    public static final String HWDEVICE_LINK_SPEEDFACTOR_TAGTYPE = "HwDevice_Link_speedFactor";

    /**
     * Tells whether a {@link HwDeviceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwDevice_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a73be519-b4b7-49a2-928f-8dad8223b9e8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDeviceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwDevice_Link >> then instantiate a {@link HwDeviceLink} proxy.
     * 
     * @return a {@link HwDeviceLink} proxy on the created {@link Link}.
     */
    @objid ("22c1ba73-f64a-4d18-b6fa-2283503224ec")
    public static HwDeviceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwDeviceLink.STEREOTYPE_NAME);
        return HwDeviceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwDeviceLink} proxy from a {@link Link} stereotyped << HwDevice_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwDeviceLink} proxy or <i>null</i>.
     */
    @objid ("caf8dc43-a8d4-4d0e-8661-32105c604ab4")
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
    @objid ("050ac7f4-9e70-4502-93db-9aa36a65939d")
    public static HwDeviceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwDeviceLink.canInstantiate(obj))
        	return new HwDeviceLink(obj);
        else
        	throw new IllegalArgumentException("HwDeviceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("68bc6240-086c-4ef6-a444-04ef944e0a4e")
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
    @objid ("8d1e6e1e-8054-4750-b2c9-884f06b8d546")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'HwDevice_Link_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c1c76bda-3232-4ea7-8977-81766216161a")
    public String getHwDevice_Link_mainScheduler() {
        return this.elt.getTagValue(HwDeviceLink.MdaTypes.HWDEVICE_LINK_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDevice_Link_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2803f3c1-a423-4a4c-a9f7-f6d858775677")
    public String getHwDevice_Link_speedFactor() {
        return this.elt.getTagValue(HwDeviceLink.MdaTypes.HWDEVICE_LINK_SPEEDFACTOR_TAGTYPE_ELT);
    }

    @objid ("a8ebe38b-29bc-49d7-9550-132314974b77")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwDevice_Link_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1cf594aa-8231-4914-96b6-60ba18f0b36a")
    public void setHwDevice_Link_mainScheduler(final String value) {
        this.elt.putTagValue(HwDeviceLink.MdaTypes.HWDEVICE_LINK_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDevice_Link_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d03f88d5-8d1e-4a30-812c-d3b8d37a05dc")
    public void setHwDevice_Link_speedFactor(final String value) {
        this.elt.putTagValue(HwDeviceLink.MdaTypes.HWDEVICE_LINK_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    @objid ("34dc44ff-601d-47ab-9862-fc9547ed62a1")
    protected HwDeviceLink(final Link elt) {
        super(elt);
    }

    @objid ("c50562fa-45c4-4ea0-871c-c6662a0413bf")
    public static final class MdaTypes {
        @objid ("71874644-7ee5-4246-9003-b5094843a3a8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c35a5e86-540e-424b-af9a-d6176ad88604")
        public static TagType HWDEVICE_LINK_SPEEDFACTOR_TAGTYPE_ELT;

        @objid ("95164509-539e-4670-ad4f-5d44a8d4f036")
        public static TagType HWDEVICE_LINK_MAINSCHEDULER_TAGTYPE_ELT;

        @objid ("2ab81250-cf4a-40ff-8ed4-97a8416a3859")
        private static Stereotype MDAASSOCDEP;

        @objid ("8fb4c405-ab81-41db-b530-0164800a5859")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8e881a61-a8fd-4099-be41-b2fc00f0a8de")
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
