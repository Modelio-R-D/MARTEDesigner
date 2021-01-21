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
import org.modelio.module.marte.api.marte_marte_foundations_nfps.standard.constraint.NfpConstraintConstraint;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Constraint} with << ClockConstraint_Constraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("98796a1f-4f09-48da-9a39-dcae67d20c5f")
public class ClockConstraintConstraint extends NfpConstraintConstraint {
    @objid ("a1208159-b5d5-4670-bfa1-fdd29871943e")
    public static final String STEREOTYPE_NAME = "ClockConstraint_Constraint";

    @objid ("a99fb0b0-0285-40ec-b749-a58ed2395178")
    public static final String CLOCKCONSTRAINT_CONSTRAINT_ISCHRONOMETRICBASED_TAGTYPE = "ClockConstraint_Constraint_isChronometricBased";

    @objid ("668cd921-b919-4d7d-bc1f-865c1ad0e4eb")
    public static final String CLOCKCONSTRAINT_CONSTRAINT_ISCOINCIDENCEBASED_TAGTYPE = "ClockConstraint_Constraint_isCoincidenceBased";

    @objid ("32e4ade7-2538-4092-8367-d13377c7c93f")
    public static final String CLOCKCONSTRAINT_CONSTRAINT_ISPRECEDENCEBASED_TAGTYPE = "ClockConstraint_Constraint_isPrecedenceBased";

    @objid ("bc358553-bb1b-4a69-919b-1b8ac8b453de")
    public static final String CLOCKCONSTRAINT_CONSTRAINT_ON_TAGTYPE = "ClockConstraint_Constraint_on";

    /**
     * Tells whether a {@link ClockConstraintConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << ClockConstraint_Constraint >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("921357b6-f2b3-4cb6-baba-269b53b657aa")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ClockConstraintConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << ClockConstraint_Constraint >> then instantiate a {@link ClockConstraintConstraint} proxy.
     * 
     * @return a {@link ClockConstraintConstraint} proxy on the created {@link Constraint}.
     */
    @objid ("ecc5f16c-6977-4d3f-82b9-1eaf38910bba")
    public static ClockConstraintConstraint create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Constraint");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ClockConstraintConstraint.STEREOTYPE_NAME);
        return ClockConstraintConstraint.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link ClockConstraintConstraint} proxy from a {@link Constraint} stereotyped << ClockConstraint_Constraint >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Constraint
     * @return a {@link ClockConstraintConstraint} proxy or <i>null</i>.
     */
    @objid ("0bcbcc5c-600f-406a-a087-fd0c19988346")
    public static ClockConstraintConstraint instantiate(final Constraint obj) {
        return ClockConstraintConstraint.canInstantiate(obj) ? new ClockConstraintConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ClockConstraintConstraint} proxy from a {@link Constraint} stereotyped << ClockConstraint_Constraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Constraint}
     * @return a {@link ClockConstraintConstraint} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("640c8bd5-77a8-4e2b-88ae-f338b1f27038")
    public static ClockConstraintConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (ClockConstraintConstraint.canInstantiate(obj))
        	return new ClockConstraintConstraint(obj);
        else
        	throw new IllegalArgumentException("ClockConstraintConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("dba33276-1c2a-45dc-8644-3327aca030d3")
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
        ClockConstraintConstraint other = (ClockConstraintConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for List<String> property 'ClockConstraint_Constraint_on'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("08673385-20d7-4155-8a57-e4c083b3f78b")
    public List<String> getClockConstraint_Constraint_on() {
        return this.elt.getTagValues(ClockConstraintConstraint.MdaTypes.CLOCKCONSTRAINT_CONSTRAINT_ON_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("5ad2b56a-e411-41e3-bbde-eb8197f4a6b0")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    @objid ("447bcbe3-ccc9-4073-876d-a38b600de257")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'ClockConstraint_Constraint_isChronometricBased'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fa5d2054-551e-4d68-82a5-4319a361e5e7")
    public boolean isClockConstraint_Constraint_isChronometricBased() {
        return this.elt.isTagged(ClockConstraintConstraint.MdaTypes.CLOCKCONSTRAINT_CONSTRAINT_ISCHRONOMETRICBASED_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'ClockConstraint_Constraint_isCoincidenceBased'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1a1ffc1d-5d55-4bb5-95eb-008007a122dd")
    public boolean isClockConstraint_Constraint_isCoincidenceBased() {
        return this.elt.isTagged(ClockConstraintConstraint.MdaTypes.CLOCKCONSTRAINT_CONSTRAINT_ISCOINCIDENCEBASED_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'ClockConstraint_Constraint_isPrecedenceBased'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("24affc32-f792-452a-9104-101b0717defb")
    public boolean isClockConstraint_Constraint_isPrecedenceBased() {
        return this.elt.isTagged(ClockConstraintConstraint.MdaTypes.CLOCKCONSTRAINT_CONSTRAINT_ISPRECEDENCEBASED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'ClockConstraint_Constraint_isChronometricBased'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("98dd4cf2-89a8-4e8b-8c29-32e77e8dd172")
    public void setClockConstraint_Constraint_isChronometricBased(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(ClockConstraintConstraint.MdaTypes.CLOCKCONSTRAINT_CONSTRAINT_ISCHRONOMETRICBASED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(ClockConstraintConstraint.MdaTypes.CLOCKCONSTRAINT_CONSTRAINT_ISCHRONOMETRICBASED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'ClockConstraint_Constraint_isCoincidenceBased'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a596d9e9-0ef4-493a-8b5a-9f1bb25b78e4")
    public void setClockConstraint_Constraint_isCoincidenceBased(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(ClockConstraintConstraint.MdaTypes.CLOCKCONSTRAINT_CONSTRAINT_ISCOINCIDENCEBASED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(ClockConstraintConstraint.MdaTypes.CLOCKCONSTRAINT_CONSTRAINT_ISCOINCIDENCEBASED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'ClockConstraint_Constraint_isPrecedenceBased'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ba3c036b-cdef-4a1d-b2e7-eb2a6dbd9230")
    public void setClockConstraint_Constraint_isPrecedenceBased(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(ClockConstraintConstraint.MdaTypes.CLOCKCONSTRAINT_CONSTRAINT_ISPRECEDENCEBASED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(ClockConstraintConstraint.MdaTypes.CLOCKCONSTRAINT_CONSTRAINT_ISPRECEDENCEBASED_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'ClockConstraint_Constraint_on'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e0b3d0fc-7177-4960-a586-2028458e7016")
    public void setClockConstraint_Constraint_on(final List<String> values) {
        this.elt.putTagValues(ClockConstraintConstraint.MdaTypes.CLOCKCONSTRAINT_CONSTRAINT_ON_TAGTYPE_ELT, values);
    }

    @objid ("f52fdc57-a1c3-4776-8e5f-12206d1bfa59")
    protected ClockConstraintConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("1b8150e4-0b54-410a-bb6a-e0b2d51a7d6b")
    public static final class MdaTypes {
        @objid ("72d10104-31e7-4483-afe5-9e87aebade52")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2e474a9d-3fbf-4fbd-8d91-cd3fe6ffb6fe")
        public static TagType CLOCKCONSTRAINT_CONSTRAINT_ISCOINCIDENCEBASED_TAGTYPE_ELT;

        @objid ("0d642c9d-5f61-42e2-b43a-ced0447d960e")
        public static TagType CLOCKCONSTRAINT_CONSTRAINT_ISPRECEDENCEBASED_TAGTYPE_ELT;

        @objid ("54918709-489b-4280-83c5-176125d0c37c")
        public static TagType CLOCKCONSTRAINT_CONSTRAINT_ISCHRONOMETRICBASED_TAGTYPE_ELT;

        @objid ("6d3d1e05-1878-4662-a336-29bd6ee9bda3")
        public static TagType CLOCKCONSTRAINT_CONSTRAINT_ON_TAGTYPE_ELT;

        @objid ("4ee79a17-4e8b-4f92-b352-4b1e390e5f1a")
        private static Stereotype MDAASSOCDEP;

        @objid ("67dfe782-488b-4c2e-be3c-23904a1d845e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0f26e1d1-f730-4dc8-8efb-8fec049ee7bf")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "db38e315-0cce-11df-8525-001302895b2b");
            CLOCKCONSTRAINT_CONSTRAINT_ISCOINCIDENCEBASED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "db38e317-0cce-11df-8525-001302895b2b");
            CLOCKCONSTRAINT_CONSTRAINT_ISPRECEDENCEBASED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "db38e319-0cce-11df-8525-001302895b2b");
            CLOCKCONSTRAINT_CONSTRAINT_ISCHRONOMETRICBASED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "db3b4565-0cce-11df-8525-001302895b2b");
            CLOCKCONSTRAINT_CONSTRAINT_ON_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "46afdb04-1259-11df-8f55-0014222a9f79");
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
