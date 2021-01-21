/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_nfps.standard.constraint;

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
 * Proxy class to handle a {@link Constraint} with << NfpConstraint_Constraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d425580c-3ccd-4fea-9abd-a05e4f8e7ed5")
public class NfpConstraintConstraint {
    @objid ("55658792-efc9-4b26-8355-623f3d998cde")
    public static final String STEREOTYPE_NAME = "NfpConstraint_Constraint";

    @objid ("1bc01957-a445-4140-9200-468f00e79654")
    public static final String NFPCONSTRAINT_CONSTRAINT_KIND_TAGTYPE = "NfpConstraint_Constraint_kind";

    @objid ("8667ea94-6353-47d0-94b4-a71a2ea221f0")
    public static final String NFPCONSTRAINT_CONSTRAINT_MODE_TAGTYPE = "NfpConstraint_Constraint_mode";

    /**
     * The underlying {@link Constraint} represented by this proxy, never null.
     */
    @objid ("b702b0f7-dce4-412e-9f60-126e619dc04c")
    protected final Constraint elt;

    /**
     * Tells whether a {@link NfpConstraintConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << NfpConstraint_Constraint >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("37c92fd1-73e9-4cd9-81b7-76353d66c018")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, NfpConstraintConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << NfpConstraint_Constraint >> then instantiate a {@link NfpConstraintConstraint} proxy.
     * 
     * @return a {@link NfpConstraintConstraint} proxy on the created {@link Constraint}.
     */
    @objid ("38973398-8d14-4cd9-ab77-a8139efe736c")
    public static NfpConstraintConstraint create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Constraint");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, NfpConstraintConstraint.STEREOTYPE_NAME);
        return NfpConstraintConstraint.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link NfpConstraintConstraint} proxy from a {@link Constraint} stereotyped << NfpConstraint_Constraint >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Constraint
     * @return a {@link NfpConstraintConstraint} proxy or <i>null</i>.
     */
    @objid ("84ec9e2b-6952-4224-b15a-c83424bd2674")
    public static NfpConstraintConstraint instantiate(final Constraint obj) {
        return NfpConstraintConstraint.canInstantiate(obj) ? new NfpConstraintConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link NfpConstraintConstraint} proxy from a {@link Constraint} stereotyped << NfpConstraint_Constraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Constraint}
     * @return a {@link NfpConstraintConstraint} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("fe120f1f-c945-4750-8c7c-88b38bcf0905")
    public static NfpConstraintConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (NfpConstraintConstraint.canInstantiate(obj))
        	return new NfpConstraintConstraint(obj);
        else
        	throw new IllegalArgumentException("NfpConstraintConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8b31d5e8-8616-4e55-ba49-0f7bba241fab")
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
        NfpConstraintConstraint other = (NfpConstraintConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("39f0d211-37b6-4d9f-81e5-2b00deed6817")
    public Constraint getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'NfpConstraint_Constraint_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4f0502e5-c8a0-4115-be84-5f0867f9dc49")
    public String getNfpConstraint_Constraint_kind() {
        return this.elt.getTagValue(NfpConstraintConstraint.MdaTypes.NFPCONSTRAINT_CONSTRAINT_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NfpConstraint_Constraint_mode'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("409eaef1-97d1-4e2c-aed4-368e1b18b814")
    public List<String> getNfpConstraint_Constraint_mode() {
        return this.elt.getTagValues(NfpConstraintConstraint.MdaTypes.NFPCONSTRAINT_CONSTRAINT_MODE_TAGTYPE_ELT);
    }

    @objid ("645dcc9d-b6cb-4c78-ae29-df0300581277")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'NfpConstraint_Constraint_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ed8f4296-6635-4922-a42e-bcf1d8594ea0")
    public void setNfpConstraint_Constraint_kind(final String value) {
        this.elt.putTagValue(NfpConstraintConstraint.MdaTypes.NFPCONSTRAINT_CONSTRAINT_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'NfpConstraint_Constraint_mode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6d97a729-e771-4bcd-b842-be95c73763f8")
    public void setNfpConstraint_Constraint_mode(final List<String> values) {
        this.elt.putTagValues(NfpConstraintConstraint.MdaTypes.NFPCONSTRAINT_CONSTRAINT_MODE_TAGTYPE_ELT, values);
    }

    @objid ("c94ed4f4-7b08-489d-993b-4f0aa35e5f15")
    protected NfpConstraintConstraint(final Constraint elt) {
        this.elt = elt;
    }

    @objid ("5dd4ae43-add6-4078-ae2b-611cdfddcdcc")
    public static final class MdaTypes {
        @objid ("bf2b981f-0f2c-410a-b0e3-b70d5c460ee5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0e7388ea-9e8a-4113-866a-06f86e244688")
        public static TagType NFPCONSTRAINT_CONSTRAINT_KIND_TAGTYPE_ELT;

        @objid ("8add53f4-416f-4016-aa97-92bf9ac76e68")
        public static TagType NFPCONSTRAINT_CONSTRAINT_MODE_TAGTYPE_ELT;

        @objid ("473b3452-33b7-4454-b2a7-2a98a24f2f4f")
        private static Stereotype MDAASSOCDEP;

        @objid ("96fa5988-8c3d-43b8-abc3-66b5820ba112")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0089c35e-1976-4741-9989-b40e274388b3")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d96f2592-0cce-11df-8525-001302895b2b");
            NFPCONSTRAINT_CONSTRAINT_KIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d98e23bd-0cce-11df-8525-001302895b2b");
            NFPCONSTRAINT_CONSTRAINT_MODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d98e23bf-0cce-11df-8525-001302895b2b");
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
