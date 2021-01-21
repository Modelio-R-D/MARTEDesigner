/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_time.standard.constraint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
 * Proxy class to handle a {@link Constraint} with << DurationConstraint_Constraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f7845a3b-7f1d-4cc5-a11e-7e3b1697734b")
public class DurationConstraintConstraint {
    @objid ("e448269f-58e5-40ff-afbf-6b7512b3b9dd")
    public static final String STEREOTYPE_NAME = "DurationConstraint_Constraint";

    @objid ("0c2e4235-7534-45da-8151-60097785fcc0")
    public static final String DURATIONCONSTRAINT_CONSTRAINT_FIRSTEVENT_TAGTYPE = "DurationConstraint_Constraint_firstEvent";

    /**
     * The underlying {@link Constraint} represented by this proxy, never null.
     */
    @objid ("e0dd3030-8956-405a-856e-185af594cf26")
    protected final Constraint elt;

    /**
     * Tells whether a {@link DurationConstraintConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << DurationConstraint_Constraint >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("4b094253-94bf-4e2c-8c91-fac539ee9e10")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DurationConstraintConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << DurationConstraint_Constraint >> then instantiate a {@link DurationConstraintConstraint} proxy.
     * 
     * @return a {@link DurationConstraintConstraint} proxy on the created {@link Constraint}.
     */
    @objid ("c726eaf3-8451-4011-8793-b6d2e549e2b3")
    public static DurationConstraintConstraint create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Constraint");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DurationConstraintConstraint.STEREOTYPE_NAME);
        return DurationConstraintConstraint.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link DurationConstraintConstraint} proxy from a {@link Constraint} stereotyped << DurationConstraint_Constraint >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Constraint
     * @return a {@link DurationConstraintConstraint} proxy or <i>null</i>.
     */
    @objid ("dbd87cac-0782-4fb3-bc21-0e9fcf27eb79")
    public static DurationConstraintConstraint instantiate(final Constraint obj) {
        return DurationConstraintConstraint.canInstantiate(obj) ? new DurationConstraintConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DurationConstraintConstraint} proxy from a {@link Constraint} stereotyped << DurationConstraint_Constraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Constraint}
     * @return a {@link DurationConstraintConstraint} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("447ae069-b9b2-46f7-97cd-e5f7cd193575")
    public static DurationConstraintConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (DurationConstraintConstraint.canInstantiate(obj))
        	return new DurationConstraintConstraint(obj);
        else
        	throw new IllegalArgumentException("DurationConstraintConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f0e33198-967c-45c1-bbd1-d17ea2b41841")
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
        DurationConstraintConstraint other = (DurationConstraintConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for List<String> property 'DurationConstraint_Constraint_firstEvent'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8a513126-9cb6-4ab4-9fc1-dbba7e033ae9")
    public List<String> getDurationConstraint_Constraint_firstEvent() {
        return this.elt.getTagValues(DurationConstraintConstraint.MdaTypes.DURATIONCONSTRAINT_CONSTRAINT_FIRSTEVENT_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("7611fe03-29b9-40ed-b461-c2d5252865e6")
    public Constraint getElement() {
        return this.elt;
    }

    @objid ("e232b431-235f-4af5-89d5-157edab62d12")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'DurationConstraint_Constraint_firstEvent'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("abe234a4-c95c-44e4-8490-583b090e25f7")
    public void setDurationConstraint_Constraint_firstEvent(final List<String> values) {
        this.elt.putTagValues(DurationConstraintConstraint.MdaTypes.DURATIONCONSTRAINT_CONSTRAINT_FIRSTEVENT_TAGTYPE_ELT, values);
    }

    @objid ("353c32bb-ec87-4ae2-8276-a5333593e96d")
    protected DurationConstraintConstraint(final Constraint elt) {
        this.elt = elt;
    }

    @objid ("6d97a0d7-1949-4adb-98ba-c66c67574730")
    public static final class MdaTypes {
        @objid ("150080fa-7f81-485f-b39d-ce680addd00e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d97c6d8e-0969-4c5b-9866-f5ba2c466c88")
        public static TagType DURATIONCONSTRAINT_CONSTRAINT_FIRSTEVENT_TAGTYPE_ELT;

        @objid ("8a0e0ccb-7001-4c40-9b4b-b568e2cb39da")
        private static Stereotype MDAASSOCDEP;

        @objid ("3104f89a-763d-49e5-adc8-a0373b43d3b5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d6d4235c-f1aa-49eb-afc8-e4c8865be129")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fe852062-97b6-11e3-8772-0027103f347d");
            DURATIONCONSTRAINT_CONSTRAINT_FIRSTEVENT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1a8f1eef-97b7-11e3-8772-0027103f347d");
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
