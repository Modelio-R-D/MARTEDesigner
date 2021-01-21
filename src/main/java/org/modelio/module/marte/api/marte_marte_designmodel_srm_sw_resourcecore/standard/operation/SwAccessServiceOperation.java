/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.operation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.operation.GrServiceOperation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Operation} with << SwAccessService_Operation >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("e3d8a9af-7595-4c35-aa0c-3227d35b19ba")
public class SwAccessServiceOperation extends GrServiceOperation {
    @objid ("5dc70f32-ed60-45b9-bae8-f71a25623e34")
    public static final String STEREOTYPE_NAME = "SwAccessService_Operation";

    @objid ("e172119b-f88b-4e4e-80b0-a1a422595c72")
    public static final String SWACCESSSERVICE_OPERATION_ACCESSEDELEMENT_TAGTYPE = "SwAccessService_Operation_accessedElement";

    @objid ("f3cfeb1b-c4a3-4203-a141-24e3cdf2deb0")
    public static final String SWACCESSSERVICE_OPERATION_ISMODIFIER_TAGTYPE = "SwAccessService_Operation_isModifier";

    /**
     * Tells whether a {@link SwAccessServiceOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link Operation} stereotyped << SwAccessService_Operation >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("da3822ae-23fa-46ed-9be8-ea7a4be606c9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Operation) && ((Operation) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwAccessServiceOperation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Operation} stereotyped << SwAccessService_Operation >> then instantiate a {@link SwAccessServiceOperation} proxy.
     * 
     * @return a {@link SwAccessServiceOperation} proxy on the created {@link Operation}.
     */
    @objid ("a6f28655-ba8a-4f99-8f2f-1ed821ff4572")
    public static SwAccessServiceOperation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Operation");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwAccessServiceOperation.STEREOTYPE_NAME);
        return SwAccessServiceOperation.instantiate((Operation)e);
    }

    /**
     * Tries to instantiate a {@link SwAccessServiceOperation} proxy from a {@link Operation} stereotyped << SwAccessService_Operation >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Operation
     * @return a {@link SwAccessServiceOperation} proxy or <i>null</i>.
     */
    @objid ("fd238368-8908-408f-8bb4-ea88a5beac9e")
    public static SwAccessServiceOperation instantiate(final Operation obj) {
        return SwAccessServiceOperation.canInstantiate(obj) ? new SwAccessServiceOperation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwAccessServiceOperation} proxy from a {@link Operation} stereotyped << SwAccessService_Operation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Operation}
     * @return a {@link SwAccessServiceOperation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2c7d20a6-52cd-40b8-a31f-4207c25c31c7")
    public static SwAccessServiceOperation safeInstantiate(final Operation obj) throws IllegalArgumentException {
        if (SwAccessServiceOperation.canInstantiate(obj))
        	return new SwAccessServiceOperation(obj);
        else
        	throw new IllegalArgumentException("SwAccessServiceOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c6c6e743-bfac-4232-a631-f8533270b77a")
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
        SwAccessServiceOperation other = (SwAccessServiceOperation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Operation}. 
     * @return the Operation represented by this proxy, never null.
     */
    @objid ("cb31e14e-d757-4a42-a488-5aac7401f88f")
    @Override
    public Operation getElement() {
        return (Operation)super.getElement();
    }

    /**
     * Getter for string property 'SwAccessService_Operation_accessedElement'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("95348491-f4fb-46db-ace6-fc9dc7b51639")
    public String getSwAccessService_Operation_accessedElement() {
        return this.elt.getTagValue(SwAccessServiceOperation.MdaTypes.SWACCESSSERVICE_OPERATION_ACCESSEDELEMENT_TAGTYPE_ELT);
    }

    @objid ("ffc36fc3-41fc-4bcf-9911-2aea1abc86cd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwAccessService_Operation_isModifier'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4eab1053-e45b-44cf-ba76-77c5e45f9215")
    public boolean isSwAccessService_Operation_isModifier() {
        return this.elt.isTagged(SwAccessServiceOperation.MdaTypes.SWACCESSSERVICE_OPERATION_ISMODIFIER_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SwAccessService_Operation_accessedElement'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f60a3381-127d-422f-9c9b-b88046515ada")
    public void setSwAccessService_Operation_accessedElement(final String value) {
        this.elt.putTagValue(SwAccessServiceOperation.MdaTypes.SWACCESSSERVICE_OPERATION_ACCESSEDELEMENT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SwAccessService_Operation_isModifier'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("41139b86-0539-4520-92ea-2d60213372d6")
    public void setSwAccessService_Operation_isModifier(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwAccessServiceOperation.MdaTypes.SWACCESSSERVICE_OPERATION_ISMODIFIER_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwAccessServiceOperation.MdaTypes.SWACCESSSERVICE_OPERATION_ISMODIFIER_TAGTYPE_ELT);
    }

    @objid ("f83e6c7d-a576-49a3-83ea-75a8c1af20cc")
    protected SwAccessServiceOperation(final Operation elt) {
        super(elt);
    }

    @objid ("cb5362c9-3a39-45d2-aea4-81b6461ec1a7")
    public static final class MdaTypes {
        @objid ("e32348d0-f82d-4d58-9aa2-f1207d102ae9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("211a0165-87bb-4655-8a32-a8c7c4c50f3c")
        public static TagType SWACCESSSERVICE_OPERATION_ISMODIFIER_TAGTYPE_ELT;

        @objid ("dbdefb8d-1958-4681-a7e1-c445bc7514ca")
        public static TagType SWACCESSSERVICE_OPERATION_ACCESSEDELEMENT_TAGTYPE_ELT;

        @objid ("246254cf-f431-4ff0-87b3-36b8728495af")
        private static Stereotype MDAASSOCDEP;

        @objid ("23d48aa7-5b21-4ea3-812f-f30ce541eb03")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("006adcc9-9147-4447-98e1-7bbd0f606b30")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01a588c7-0ccf-11df-8525-001302895b2b");
            SWACCESSSERVICE_OPERATION_ISMODIFIER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a7eb05-0ccf-11df-8525-001302895b2b");
            SWACCESSSERVICE_OPERATION_ACCESSEDELEMENT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a7eb0b-0ccf-11df-8525-001302895b2b");
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
