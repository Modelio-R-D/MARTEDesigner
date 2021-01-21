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
 * Proxy class to handle a {@link Link} with << HwTimer_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("5f28df1a-2a41-4526-beb5-4cf7840d367a")
public class HwTimerLink extends HwTimingResourceLink {
    @objid ("c750c881-36f3-4bc7-add9-68994ab02ccf")
    public static final String STEREOTYPE_NAME = "HwTimer_Link";

    @objid ("856a81d6-73f7-4e88-b187-d66eb1797dab")
    public static final String HWTIMER_LINK_COUNTERWIDTH_TAGTYPE = "HwTimer_Link_counterWidth";

    @objid ("80325db2-be44-4dc6-99d2-c15e170f2444")
    public static final String HWTIMER_LINK_INPUTCLOCK_TAGTYPE = "HwTimer_Link_inputClock";

    @objid ("fc89a1db-2bf1-4075-8d83-98f2b2a38e05")
    public static final String HWTIMER_LINK_NBCOUNTERS_TAGTYPE = "HwTimer_Link_nbCounters";

    /**
     * Tells whether a {@link HwTimerLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwTimer_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("752bfa2f-007e-4e50-a76e-f9d0629f55bf")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwTimerLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwTimer_Link >> then instantiate a {@link HwTimerLink} proxy.
     * 
     * @return a {@link HwTimerLink} proxy on the created {@link Link}.
     */
    @objid ("eea50509-d71a-4138-8739-7c4356b3182d")
    public static HwTimerLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwTimerLink.STEREOTYPE_NAME);
        return HwTimerLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwTimerLink} proxy from a {@link Link} stereotyped << HwTimer_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwTimerLink} proxy or <i>null</i>.
     */
    @objid ("e9178ef6-48df-4e46-b7d9-2d55250cddcf")
    public static HwTimerLink instantiate(final Link obj) {
        return HwTimerLink.canInstantiate(obj) ? new HwTimerLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwTimerLink} proxy from a {@link Link} stereotyped << HwTimer_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link HwTimerLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ce8f4629-9898-4770-a754-e254cdf80f0e")
    public static HwTimerLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwTimerLink.canInstantiate(obj))
        	return new HwTimerLink(obj);
        else
        	throw new IllegalArgumentException("HwTimerLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("85461f73-8721-4a70-b349-be98558adee7")
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
        HwTimerLink other = (HwTimerLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("17481163-6296-4952-962e-670d6d330cbb")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'HwTimer_Link_counterWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("454187ff-5073-450a-8abd-ce333e4659b4")
    public String getHwTimer_Link_counterWidth() {
        return this.elt.getTagValue(HwTimerLink.MdaTypes.HWTIMER_LINK_COUNTERWIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimer_Link_inputClock'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bf5de8d3-f373-4865-add2-cf06eeb3f126")
    public String getHwTimer_Link_inputClock() {
        return this.elt.getTagValue(HwTimerLink.MdaTypes.HWTIMER_LINK_INPUTCLOCK_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimer_Link_nbCounters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9f052710-b572-4a46-8d09-037c1d2028f7")
    public String getHwTimer_Link_nbCounters() {
        return this.elt.getTagValue(HwTimerLink.MdaTypes.HWTIMER_LINK_NBCOUNTERS_TAGTYPE_ELT);
    }

    @objid ("b22b2f48-f30b-411c-a908-feb93627e887")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwTimer_Link_counterWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("44451f36-cab1-46cd-8b48-138257b62cf3")
    public void setHwTimer_Link_counterWidth(final String value) {
        this.elt.putTagValue(HwTimerLink.MdaTypes.HWTIMER_LINK_COUNTERWIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwTimer_Link_inputClock'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("548a06ea-620e-4d32-8b5d-7684f3d4d3f8")
    public void setHwTimer_Link_inputClock(final String value) {
        this.elt.putTagValue(HwTimerLink.MdaTypes.HWTIMER_LINK_INPUTCLOCK_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwTimer_Link_nbCounters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1ed9e9be-46c4-4074-9a30-84a1b879cc3c")
    public void setHwTimer_Link_nbCounters(final String value) {
        this.elt.putTagValue(HwTimerLink.MdaTypes.HWTIMER_LINK_NBCOUNTERS_TAGTYPE_ELT, value);
    }

    @objid ("9f873e68-c748-4487-b2b7-9c929141a5fa")
    protected HwTimerLink(final Link elt) {
        super(elt);
    }

    @objid ("6ce8deb7-9596-4226-9286-e717119b0463")
    public static final class MdaTypes {
        @objid ("77b6bceb-1439-4b71-9551-6fd331fb0fca")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1fb0cf88-d9f0-4f34-8ca1-66c22539fcf0")
        public static TagType HWTIMER_LINK_NBCOUNTERS_TAGTYPE_ELT;

        @objid ("f0d8c24e-b35f-46f9-baf7-f176a97bd1e6")
        public static TagType HWTIMER_LINK_COUNTERWIDTH_TAGTYPE_ELT;

        @objid ("08ef333d-c6e1-4a66-bb31-b33d67b98dc6")
        public static TagType HWTIMER_LINK_INPUTCLOCK_TAGTYPE_ELT;

        @objid ("8ad9d8fb-53bb-49cf-8ad8-1f1e0e57ee16")
        private static Stereotype MDAASSOCDEP;

        @objid ("dc2017cf-39b3-4d40-bdbe-decec8478b71")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b68dbe81-5a48-46f9-b166-81f35d792f59")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "012e54ab-0ccf-11df-8525-001302895b2b");
            HWTIMER_LINK_NBCOUNTERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "012e54b2-0ccf-11df-8525-001302895b2b");
            HWTIMER_LINK_COUNTERWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "012e54b9-0ccf-11df-8525-001302895b2b");
            HWTIMER_LINK_INPUTCLOCK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "012e54c0-0ccf-11df-8525-001302895b2b");
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
