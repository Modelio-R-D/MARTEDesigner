/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << HwClock_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwClockInstance extends HwTimingResourceInstance {
    public static final String STEREOTYPE_NAME = "HwClock_Instance";

    public static final String HWCLOCK_INSTANCE_FREQUENCY_TAGTYPE = "HwClock_Instance_frequency";

    /**
     * Tells whether a {@link HwClockInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwClock_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwClockInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwClock_Instance >> then instantiate a {@link HwClockInstance} proxy.
     * 
     * @return a {@link HwClockInstance} proxy on the created {@link Instance}.
     */
    public static HwClockInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwClockInstance.STEREOTYPE_NAME);
        return HwClockInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwClockInstance} proxy from a {@link Instance} stereotyped << HwClock_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwClockInstance} proxy or <i>null</i>.
     */
    public static HwClockInstance instantiate(final Instance obj) {
        return HwClockInstance.canInstantiate(obj) ? new HwClockInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwClockInstance} proxy from a {@link Instance} stereotyped << HwClock_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link HwClockInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwClockInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwClockInstance.canInstantiate(obj))
        	return new HwClockInstance(obj);
        else
        	throw new IllegalArgumentException("HwClockInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwClockInstance other = (HwClockInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'HwClock_Instance_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwClock_Instance_frequency() {
        return this.elt.getTagValue(HwClockInstance.MdaTypes.HWCLOCK_INSTANCE_FREQUENCY_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwClock_Instance_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwClock_Instance_frequency(final String value) {
        this.elt.putTagValue(HwClockInstance.MdaTypes.HWCLOCK_INSTANCE_FREQUENCY_TAGTYPE_ELT, value);
    }

    protected HwClockInstance(final Instance elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWCLOCK_INSTANCE_FREQUENCY_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01272dba-0ccf-11df-8525-001302895b2b");
            HWCLOCK_INSTANCE_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f73f97a1-123c-11df-8f55-0014222a9f79");
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
