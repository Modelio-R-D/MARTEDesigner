/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << TimerResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class TimerResourceAssociationEnd extends TimingResourceAssociationEnd {
    public static final String STEREOTYPE_NAME = "TimerResource_AssociationEnd";

    public static final String TIMERRESOURCE_ASSOCIATIONEND_DURATION_TAGTYPE = "TimerResource_AssociationEnd_duration";

    public static final String TIMERRESOURCE_ASSOCIATIONEND_ISPERIODIC_TAGTYPE = "TimerResource_AssociationEnd_isPeriodic";

    /**
     * Tells whether a {@link TimerResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << TimerResource_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimerResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << TimerResource_AssociationEnd >> then instantiate a {@link TimerResourceAssociationEnd} proxy.
     * 
     * @return a {@link TimerResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    public static TimerResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimerResourceAssociationEnd.STEREOTYPE_NAME);
        return TimerResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link TimerResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << TimerResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link TimerResourceAssociationEnd} proxy or <i>null</i>.
     */
    public static TimerResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return TimerResourceAssociationEnd.canInstantiate(obj) ? new TimerResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimerResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << TimerResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link TimerResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static TimerResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (TimerResourceAssociationEnd.canInstantiate(obj))
        	return new TimerResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("TimerResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        TimerResourceAssociationEnd other = (TimerResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'TimerResource_AssociationEnd_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getTimerResource_AssociationEnd_duration() {
        return this.elt.getTagValue(TimerResourceAssociationEnd.MdaTypes.TIMERRESOURCE_ASSOCIATIONEND_DURATION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'TimerResource_AssociationEnd_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isTimerResource_AssociationEnd_isPeriodic() {
        return this.elt.isTagged(TimerResourceAssociationEnd.MdaTypes.TIMERRESOURCE_ASSOCIATIONEND_ISPERIODIC_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'TimerResource_AssociationEnd_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTimerResource_AssociationEnd_duration(final String value) {
        this.elt.putTagValue(TimerResourceAssociationEnd.MdaTypes.TIMERRESOURCE_ASSOCIATIONEND_DURATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'TimerResource_AssociationEnd_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTimerResource_AssociationEnd_isPeriodic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(TimerResourceAssociationEnd.MdaTypes.TIMERRESOURCE_ASSOCIATIONEND_ISPERIODIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(TimerResourceAssociationEnd.MdaTypes.TIMERRESOURCE_ASSOCIATIONEND_ISPERIODIC_TAGTYPE_ELT);
    }

    protected TimerResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType TIMERRESOURCE_ASSOCIATIONEND_DURATION_TAGTYPE_ELT;

        public static TagType TIMERRESOURCE_ASSOCIATIONEND_ISPERIODIC_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00a1abc4-0ccf-11df-8525-001302895b2b");
            TIMERRESOURCE_ASSOCIATIONEND_DURATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00a1abcb-0ccf-11df-8525-001302895b2b");
            TIMERRESOURCE_ASSOCIATIONEND_ISPERIODIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00a1abd2-0ccf-11df-8525-001302895b2b");
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
