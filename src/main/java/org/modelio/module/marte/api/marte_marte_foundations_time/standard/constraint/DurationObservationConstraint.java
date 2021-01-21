/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_time.standard.constraint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Constraint} with << DurationObservation_Constraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("25755b2c-1d83-4713-8fc7-30e0294e6a3a")
public class DurationObservationConstraint {
    @objid ("0933e779-9d60-42a2-b7df-cb9739fb7ad8")
    public static final String STEREOTYPE_NAME = "DurationObservation_Constraint";

    /**
     * The underlying {@link Constraint} represented by this proxy, never null.
     */
    @objid ("89fd4002-86c5-4b60-b768-adffd08de8e8")
    protected final Constraint elt;

    /**
     * Tells whether a {@link DurationObservationConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << DurationObservation_Constraint >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("2431f3c2-9681-46e8-9f67-5704dd4302df")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DurationObservationConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << DurationObservation_Constraint >> then instantiate a {@link DurationObservationConstraint} proxy.
     * 
     * @return a {@link DurationObservationConstraint} proxy on the created {@link Constraint}.
     */
    @objid ("ed81ccf5-b46e-452b-b6c0-e1e56be461f7")
    public static DurationObservationConstraint create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Constraint");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DurationObservationConstraint.STEREOTYPE_NAME);
        return DurationObservationConstraint.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link DurationObservationConstraint} proxy from a {@link Constraint} stereotyped << DurationObservation_Constraint >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Constraint
     * @return a {@link DurationObservationConstraint} proxy or <i>null</i>.
     */
    @objid ("2337dea0-a78a-4b6e-a8db-445b63e3921f")
    public static DurationObservationConstraint instantiate(final Constraint obj) {
        return DurationObservationConstraint.canInstantiate(obj) ? new DurationObservationConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DurationObservationConstraint} proxy from a {@link Constraint} stereotyped << DurationObservation_Constraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Constraint}
     * @return a {@link DurationObservationConstraint} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6d8f47b4-2e3f-486b-80bb-25e2e836b865")
    public static DurationObservationConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (DurationObservationConstraint.canInstantiate(obj))
        	return new DurationObservationConstraint(obj);
        else
        	throw new IllegalArgumentException("DurationObservationConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5cae4035-b45e-485e-b689-fa3217203c7a")
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
        DurationObservationConstraint other = (DurationObservationConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("a7b298b2-7537-4960-b2eb-b1ccfcee5477")
    public Constraint getElement() {
        return this.elt;
    }

    @objid ("1bcc4386-3139-44e9-b761-ea283dcbd5df")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("e8826759-33fb-4f45-bf2f-c63608cb8f0d")
    protected DurationObservationConstraint(final Constraint elt) {
        this.elt = elt;
    }

    @objid ("d4584cbe-a7aa-4b45-b0ee-27f45f6a21b2")
    public static final class MdaTypes {
        @objid ("cead24e4-e777-4893-95f8-dff94e2f84c8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("518c8c34-d446-4faa-aa22-64854e51b5ff")
        private static Stereotype MDAASSOCDEP;

        @objid ("0f28a69e-1946-43e4-9a0b-011703570555")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("34987c9c-fc31-47bd-bbbd-cdfdf282ecf3")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fb23468a-3ac9-11e1-960b-0027103f347d");
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
