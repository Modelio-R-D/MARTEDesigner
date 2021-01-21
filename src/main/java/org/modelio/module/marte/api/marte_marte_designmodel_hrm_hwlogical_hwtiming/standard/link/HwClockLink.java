/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.link;

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
 * Proxy class to handle a {@link Link} with << HwClock_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("97498b99-d7a8-4d72-afe8-ab836fbc4010")
public class HwClockLink extends HwTimingResourceLink {
    @objid ("7e372b3b-1df2-4a77-9783-2d4a43de431b")
    public static final String STEREOTYPE_NAME = "HwClock_Link";

    @objid ("0143419c-8336-4526-aa0c-a8e19136f215")
    public static final String HWCLOCK_LINK_FREQUENCY_TAGTYPE = "HwClock_Link_frequency";

    /**
     * Tells whether a {@link HwClockLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwClock_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("5f015fe5-588f-4d13-aded-5fe7f44ae605")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwClockLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwClock_Link >> then instantiate a {@link HwClockLink} proxy.
     * 
     * @return a {@link HwClockLink} proxy on the created {@link Link}.
     */
    @objid ("109847b2-0a76-4afa-a644-5f30477f64be")
    public static HwClockLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwClockLink.STEREOTYPE_NAME);
        return HwClockLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwClockLink} proxy from a {@link Link} stereotyped << HwClock_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwClockLink} proxy or <i>null</i>.
     */
    @objid ("c82fa7f6-d2f8-4a0c-a6ee-a985c5f47e73")
    public static HwClockLink instantiate(final Link obj) {
        return HwClockLink.canInstantiate(obj) ? new HwClockLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwClockLink} proxy from a {@link Link} stereotyped << HwClock_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link HwClockLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("20db74e4-f1ec-4727-8482-554e7bcd2199")
    public static HwClockLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwClockLink.canInstantiate(obj))
        	return new HwClockLink(obj);
        else
        	throw new IllegalArgumentException("HwClockLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2d2510a5-0f56-4431-9311-668db6a9a973")
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
        HwClockLink other = (HwClockLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("d366e10f-49c6-49cd-b863-197c32818d88")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'HwClock_Link_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("545ce16f-6403-4294-9b1d-a22bb2beab48")
    public String getHwClock_Link_frequency() {
        return this.elt.getTagValue(HwClockLink.MdaTypes.HWCLOCK_LINK_FREQUENCY_TAGTYPE_ELT);
    }

    @objid ("f51cd269-58c5-4966-a7b3-6138799b1227")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwClock_Link_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8d862840-6b42-4211-95b9-be32680cf3ad")
    public void setHwClock_Link_frequency(final String value) {
        this.elt.putTagValue(HwClockLink.MdaTypes.HWCLOCK_LINK_FREQUENCY_TAGTYPE_ELT, value);
    }

    @objid ("70f3d1cc-7e1e-4277-879d-47deb3f55f5e")
    protected HwClockLink(final Link elt) {
        super(elt);
    }

    @objid ("9bc37499-fbdd-4572-97e8-a32d3da80adc")
    public static final class MdaTypes {
        @objid ("0b862e46-6997-4680-b296-4f450e40f884")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("19a830de-3678-47e4-b058-8b2297daaf6b")
        public static TagType HWCLOCK_LINK_FREQUENCY_TAGTYPE_ELT;

        @objid ("4eea5196-1921-436d-a35b-4c3c9ec704be")
        private static Stereotype MDAASSOCDEP;

        @objid ("9cf29055-ec2b-4f09-8db9-38fa71f97e08")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5767981e-7386-4b1f-9ecc-4d3a47deebf9")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01272db9-0ccf-11df-8525-001302895b2b");
            HWCLOCK_LINK_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f67755b5-123c-11df-8f55-0014222a9f79");
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
