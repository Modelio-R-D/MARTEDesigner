/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.usecase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
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
 * Proxy class to handle a {@link UseCase} with << PpUnit_UseCase >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class PpUnitUseCase {
    public static final String STEREOTYPE_NAME = "PpUnit_UseCase";

    public static final String PPUNIT_USECASE_CONCPOLICY_TAGTYPE = "PpUnit_UseCase_concPolicy";

    public static final String PPUNIT_USECASE_MEMORYSIZE_TAGTYPE = "PpUnit_UseCase_memorySize";

    /**
     * The underlying {@link UseCase} represented by this proxy, never null.
     */
    protected final UseCase elt;

    /**
     * Tells whether a {@link PpUnitUseCase proxy} can be instantiated from a {@link MObject} checking it is a {@link UseCase} stereotyped << PpUnit_UseCase >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof UseCase) && ((UseCase) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, PpUnitUseCase.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link UseCase} stereotyped << PpUnit_UseCase >> then instantiate a {@link PpUnitUseCase} proxy.
     * 
     * @return a {@link PpUnitUseCase} proxy on the created {@link UseCase}.
     */
    public static PpUnitUseCase create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.UseCase");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, PpUnitUseCase.STEREOTYPE_NAME);
        return PpUnitUseCase.instantiate((UseCase)e);
    }

    /**
     * Tries to instantiate a {@link PpUnitUseCase} proxy from a {@link UseCase} stereotyped << PpUnit_UseCase >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a UseCase
     * @return a {@link PpUnitUseCase} proxy or <i>null</i>.
     */
    public static PpUnitUseCase instantiate(final UseCase obj) {
        return PpUnitUseCase.canInstantiate(obj) ? new PpUnitUseCase(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PpUnitUseCase} proxy from a {@link UseCase} stereotyped << PpUnit_UseCase >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link UseCase}
     * @return a {@link PpUnitUseCase} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static PpUnitUseCase safeInstantiate(final UseCase obj) throws IllegalArgumentException {
        if (PpUnitUseCase.canInstantiate(obj))
        	return new PpUnitUseCase(obj);
        else
        	throw new IllegalArgumentException("PpUnitUseCase: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        PpUnitUseCase other = (PpUnitUseCase) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link UseCase}. 
     * @return the UseCase represented by this proxy, never null.
     */
    public UseCase getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'PpUnit_UseCase_concPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getPpUnit_UseCase_concPolicy() {
        return this.elt.getTagValue(PpUnitUseCase.MdaTypes.PPUNIT_USECASE_CONCPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PpUnit_UseCase_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getPpUnit_UseCase_memorySize() {
        return this.elt.getTagValue(PpUnitUseCase.MdaTypes.PPUNIT_USECASE_MEMORYSIZE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'PpUnit_UseCase_concPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setPpUnit_UseCase_concPolicy(final String value) {
        this.elt.putTagValue(PpUnitUseCase.MdaTypes.PPUNIT_USECASE_CONCPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PpUnit_UseCase_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setPpUnit_UseCase_memorySize(final String value) {
        this.elt.putTagValue(PpUnitUseCase.MdaTypes.PPUNIT_USECASE_MEMORYSIZE_TAGTYPE_ELT, value);
    }

    protected PpUnitUseCase(final UseCase elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType PPUNIT_USECASE_CONCPOLICY_TAGTYPE_ELT;

        public static TagType PPUNIT_USECASE_MEMORYSIZE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d3d7b779-0ce9-11df-b742-001302895b2b");
            PPUNIT_USECASE_CONCPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d7b77a-0ce9-11df-b742-001302895b2b");
            PPUNIT_USECASE_MEMORYSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d7b77b-0ce9-11df-b742-001302895b2b");
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
