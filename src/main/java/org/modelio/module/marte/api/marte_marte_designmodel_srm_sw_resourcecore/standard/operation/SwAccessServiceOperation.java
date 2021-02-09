/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.operation;

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
public class SwAccessServiceOperation extends GrServiceOperation {
    public static final String STEREOTYPE_NAME = "SwAccessService_Operation";

    public static final String SWACCESSSERVICE_OPERATION_ACCESSEDELEMENT_TAGTYPE = "SwAccessService_Operation_accessedElement";

    public static final String SWACCESSSERVICE_OPERATION_ISMODIFIER_TAGTYPE = "SwAccessService_Operation_isModifier";

    /**
     * Tells whether a {@link SwAccessServiceOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link Operation} stereotyped << SwAccessService_Operation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Operation) && ((Operation) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwAccessServiceOperation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Operation} stereotyped << SwAccessService_Operation >> then instantiate a {@link SwAccessServiceOperation} proxy.
     * 
     * @return a {@link SwAccessServiceOperation} proxy on the created {@link Operation}.
     */
    public static SwAccessServiceOperation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Operation");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwAccessServiceOperation.STEREOTYPE_NAME);
        return SwAccessServiceOperation.instantiate((Operation)e);
    }

    /**
     * Tries to instantiate a {@link SwAccessServiceOperation} proxy from a {@link Operation} stereotyped << SwAccessService_Operation >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Operation
     * @return a {@link SwAccessServiceOperation} proxy or <i>null</i>.
     */
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
    public static SwAccessServiceOperation safeInstantiate(final Operation obj) throws IllegalArgumentException {
        if (SwAccessServiceOperation.canInstantiate(obj))
        	return new SwAccessServiceOperation(obj);
        else
        	throw new IllegalArgumentException("SwAccessServiceOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwAccessServiceOperation other = (SwAccessServiceOperation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Operation}. 
     * @return the Operation represented by this proxy, never null.
     */
    @Override
    public Operation getElement() {
        return (Operation)super.getElement();
    }

    /**
     * Getter for string property 'SwAccessService_Operation_accessedElement'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwAccessService_Operation_accessedElement() {
        return this.elt.getTagValue(SwAccessServiceOperation.MdaTypes.SWACCESSSERVICE_OPERATION_ACCESSEDELEMENT_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwAccessService_Operation_isModifier'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSwAccessService_Operation_isModifier() {
        return this.elt.isTagged(SwAccessServiceOperation.MdaTypes.SWACCESSSERVICE_OPERATION_ISMODIFIER_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SwAccessService_Operation_accessedElement'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwAccessService_Operation_accessedElement(final String value) {
        this.elt.putTagValue(SwAccessServiceOperation.MdaTypes.SWACCESSSERVICE_OPERATION_ACCESSEDELEMENT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SwAccessService_Operation_isModifier'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwAccessService_Operation_isModifier(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwAccessServiceOperation.MdaTypes.SWACCESSSERVICE_OPERATION_ISMODIFIER_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwAccessServiceOperation.MdaTypes.SWACCESSSERVICE_OPERATION_ISMODIFIER_TAGTYPE_ELT);
    }

    protected SwAccessServiceOperation(final Operation elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWACCESSSERVICE_OPERATION_ISMODIFIER_TAGTYPE_ELT;

        public static TagType SWACCESSSERVICE_OPERATION_ACCESSEDELEMENT_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
