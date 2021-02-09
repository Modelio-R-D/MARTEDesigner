/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
 * Proxy class to handle a {@link AssociationEnd} with << SecondaryScheduler_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SecondarySchedulerAssociationEnd extends SchedulerAssociationEnd {
    public static final String STEREOTYPE_NAME = "SecondaryScheduler_AssociationEnd";

    public static final String SECONDARYSCHEDULER_ASSOCIATIONEND_VIRTUALPROCESSINGUNITS_TAGTYPE = "SecondaryScheduler_AssociationEnd_virtualProcessingUnits";

    /**
     * Tells whether a {@link SecondarySchedulerAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << SecondaryScheduler_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SecondarySchedulerAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << SecondaryScheduler_AssociationEnd >> then instantiate a {@link SecondarySchedulerAssociationEnd} proxy.
     * 
     * @return a {@link SecondarySchedulerAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    public static SecondarySchedulerAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SecondarySchedulerAssociationEnd.STEREOTYPE_NAME);
        return SecondarySchedulerAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link SecondarySchedulerAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SecondaryScheduler_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link SecondarySchedulerAssociationEnd} proxy or <i>null</i>.
     */
    public static SecondarySchedulerAssociationEnd instantiate(final AssociationEnd obj) {
        return SecondarySchedulerAssociationEnd.canInstantiate(obj) ? new SecondarySchedulerAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SecondarySchedulerAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SecondaryScheduler_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link SecondarySchedulerAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SecondarySchedulerAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (SecondarySchedulerAssociationEnd.canInstantiate(obj))
        	return new SecondarySchedulerAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("SecondarySchedulerAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SecondarySchedulerAssociationEnd other = (SecondarySchedulerAssociationEnd) obj;
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
     * Getter for List<String> property 'SecondaryScheduler_AssociationEnd_virtualProcessingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSecondaryScheduler_AssociationEnd_virtualProcessingUnits() {
        return this.elt.getTagValues(SecondarySchedulerAssociationEnd.MdaTypes.SECONDARYSCHEDULER_ASSOCIATIONEND_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SecondaryScheduler_AssociationEnd_virtualProcessingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSecondaryScheduler_AssociationEnd_virtualProcessingUnits(final List<String> values) {
        this.elt.putTagValues(SecondarySchedulerAssociationEnd.MdaTypes.SECONDARYSCHEDULER_ASSOCIATIONEND_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    protected SecondarySchedulerAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SECONDARYSCHEDULER_ASSOCIATIONEND_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "002cda27-0ccf-11df-8525-001302895b2b");
            SECONDARYSCHEDULER_ASSOCIATIONEND_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "60e42b55-158d-11df-b173-0014222a9f79");
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
