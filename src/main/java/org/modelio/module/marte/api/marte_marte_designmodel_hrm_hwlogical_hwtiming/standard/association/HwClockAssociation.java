/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.association;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwClock_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwClockAssociation extends HwTimingResourceAssociation {
    public static final String STEREOTYPE_NAME = "HwClock_Association";

    public static final String HWCLOCK_ASSOCIATION_FREQUENCY_TAGTYPE = "HwClock_Association_frequency";

    /**
     * Tells whether a {@link HwClockAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwClock_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwClockAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwClock_Association >> then instantiate a {@link HwClockAssociation} proxy.
     * 
     * @return a {@link HwClockAssociation} proxy on the created {@link Association}.
     */
    public static HwClockAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwClockAssociation.STEREOTYPE_NAME);
        return HwClockAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwClockAssociation} proxy from a {@link Association} stereotyped << HwClock_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwClockAssociation} proxy or <i>null</i>.
     */
    public static HwClockAssociation instantiate(final Association obj) {
        return HwClockAssociation.canInstantiate(obj) ? new HwClockAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwClockAssociation} proxy from a {@link Association} stereotyped << HwClock_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwClockAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwClockAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwClockAssociation.canInstantiate(obj))
        	return new HwClockAssociation(obj);
        else
        	throw new IllegalArgumentException("HwClockAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
        HwClockAssociation other = (HwClockAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'HwClock_Association_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwClock_Association_frequency() {
        return this.elt.getTagValue(HwClockAssociation.MdaTypes.HWCLOCK_ASSOCIATION_FREQUENCY_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwClock_Association_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwClock_Association_frequency(final String value) {
        this.elt.putTagValue(HwClockAssociation.MdaTypes.HWCLOCK_ASSOCIATION_FREQUENCY_TAGTYPE_ELT, value);
    }

    protected HwClockAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWCLOCK_ASSOCIATION_FREQUENCY_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "612a8492-10ae-11df-81d9-0014222a9f79");
            HWCLOCK_ASSOCIATION_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fa41a14e-123c-11df-8f55-0014222a9f79");
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
