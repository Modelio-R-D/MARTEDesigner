/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance;

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
 * Proxy class to handle a {@link Instance} with << TimerResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class TimerResourceInstance extends TimingResourceInstance {
    public static final String STEREOTYPE_NAME = "TimerResource_Instance";

    public static final String TIMERRESOURCE_INSTANCE_DURATION_TAGTYPE = "TimerResource_Instance_duration";

    public static final String TIMERRESOURCE_INSTANCE_ISPERIODIC_TAGTYPE = "TimerResource_Instance_isPeriodic";

    /**
     * Tells whether a {@link TimerResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << TimerResource_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimerResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << TimerResource_Instance >> then instantiate a {@link TimerResourceInstance} proxy.
     * 
     * @return a {@link TimerResourceInstance} proxy on the created {@link Instance}.
     */
    public static TimerResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimerResourceInstance.STEREOTYPE_NAME);
        return TimerResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link TimerResourceInstance} proxy from a {@link Instance} stereotyped << TimerResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link TimerResourceInstance} proxy or <i>null</i>.
     */
    public static TimerResourceInstance instantiate(final Instance obj) {
        return TimerResourceInstance.canInstantiate(obj) ? new TimerResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimerResourceInstance} proxy from a {@link Instance} stereotyped << TimerResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link TimerResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static TimerResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (TimerResourceInstance.canInstantiate(obj))
        	return new TimerResourceInstance(obj);
        else
        	throw new IllegalArgumentException("TimerResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        TimerResourceInstance other = (TimerResourceInstance) obj;
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
     * Getter for string property 'TimerResource_Instance_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getTimerResource_Instance_duration() {
        return this.elt.getTagValue(TimerResourceInstance.MdaTypes.TIMERRESOURCE_INSTANCE_DURATION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'TimerResource_Instance_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isTimerResource_Instance_isPeriodic() {
        return this.elt.isTagged(TimerResourceInstance.MdaTypes.TIMERRESOURCE_INSTANCE_ISPERIODIC_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'TimerResource_Instance_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTimerResource_Instance_duration(final String value) {
        this.elt.putTagValue(TimerResourceInstance.MdaTypes.TIMERRESOURCE_INSTANCE_DURATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'TimerResource_Instance_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTimerResource_Instance_isPeriodic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(TimerResourceInstance.MdaTypes.TIMERRESOURCE_INSTANCE_ISPERIODIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(TimerResourceInstance.MdaTypes.TIMERRESOURCE_INSTANCE_ISPERIODIC_TAGTYPE_ELT);
    }

    protected TimerResourceInstance(final Instance elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType TIMERRESOURCE_INSTANCE_DURATION_TAGTYPE_ELT;

        public static TagType TIMERRESOURCE_INSTANCE_ISPERIODIC_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00a1abc9-0ccf-11df-8525-001302895b2b");
            TIMERRESOURCE_INSTANCE_DURATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00a1abd0-0ccf-11df-8525-001302895b2b");
            TIMERRESOURCE_INSTANCE_ISPERIODIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00a1abd7-0ccf-11df-8525-001302895b2b");
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
