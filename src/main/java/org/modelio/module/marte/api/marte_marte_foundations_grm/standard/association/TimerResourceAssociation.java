/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association;

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
 * Proxy class to handle a {@link Association} with << TimerResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class TimerResourceAssociation extends TimingResourceAssociation {
    public static final String STEREOTYPE_NAME = "TimerResource_Association";

    public static final String TIMERRESOURCE_ASSOCIATION_DURATION_TAGTYPE = "TimerResource_Association_duration";

    public static final String TIMERRESOURCE_ASSOCIATION_ISPERIODIC_TAGTYPE = "TimerResource_Association_isPeriodic";

    /**
     * Tells whether a {@link TimerResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << TimerResource_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimerResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << TimerResource_Association >> then instantiate a {@link TimerResourceAssociation} proxy.
     * 
     * @return a {@link TimerResourceAssociation} proxy on the created {@link Association}.
     */
    public static TimerResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimerResourceAssociation.STEREOTYPE_NAME);
        return TimerResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link TimerResourceAssociation} proxy from a {@link Association} stereotyped << TimerResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link TimerResourceAssociation} proxy or <i>null</i>.
     */
    public static TimerResourceAssociation instantiate(final Association obj) {
        return TimerResourceAssociation.canInstantiate(obj) ? new TimerResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimerResourceAssociation} proxy from a {@link Association} stereotyped << TimerResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link TimerResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static TimerResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (TimerResourceAssociation.canInstantiate(obj))
        	return new TimerResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("TimerResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        TimerResourceAssociation other = (TimerResourceAssociation) obj;
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
     * Getter for string property 'TimerResource_Association_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getTimerResource_Association_duration() {
        return this.elt.getTagValue(TimerResourceAssociation.MdaTypes.TIMERRESOURCE_ASSOCIATION_DURATION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'TimerResource_Association_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isTimerResource_Association_isPeriodic() {
        return this.elt.isTagged(TimerResourceAssociation.MdaTypes.TIMERRESOURCE_ASSOCIATION_ISPERIODIC_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'TimerResource_Association_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTimerResource_Association_duration(final String value) {
        this.elt.putTagValue(TimerResourceAssociation.MdaTypes.TIMERRESOURCE_ASSOCIATION_DURATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'TimerResource_Association_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTimerResource_Association_isPeriodic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(TimerResourceAssociation.MdaTypes.TIMERRESOURCE_ASSOCIATION_ISPERIODIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(TimerResourceAssociation.MdaTypes.TIMERRESOURCE_ASSOCIATION_ISPERIODIC_TAGTYPE_ELT);
    }

    protected TimerResourceAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType TIMERRESOURCE_ASSOCIATION_DURATION_TAGTYPE_ELT;

        public static TagType TIMERRESOURCE_ASSOCIATION_ISPERIODIC_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "4b33ab09-0f4c-11df-8c52-0014222a9f79");
            TIMERRESOURCE_ASSOCIATION_DURATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7f668d3e-14c6-11df-92f7-001302895b2b");
            TIMERRESOURCE_ASSOCIATION_ISPERIODIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "85e1fcce-14c6-11df-92f7-001302895b2b");
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
