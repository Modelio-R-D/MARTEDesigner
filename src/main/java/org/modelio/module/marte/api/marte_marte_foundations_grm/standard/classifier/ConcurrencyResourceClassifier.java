/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier;

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
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << ConcurrencyResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("3e4ac275-2be9-4d71-a311-7dc7575698cc")
public class ConcurrencyResourceClassifier extends ResourceClassifier {
    @objid ("b43bab71-8a12-4c2f-a2ea-e58cf6a39be7")
    public static final String STEREOTYPE_NAME = "ConcurrencyResource_Classifier";

    /**
     * Tells whether a {@link ConcurrencyResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << ConcurrencyResource_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("4876618a-3170-4ba9-a038-088342f201dd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ConcurrencyResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << ConcurrencyResource_Classifier >> then instantiate a {@link ConcurrencyResourceClassifier} proxy.
     * 
     * @return a {@link ConcurrencyResourceClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("2f6f7526-04ff-4211-a841-bc2590bcf071")
    public static ConcurrencyResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ConcurrencyResourceClassifier.STEREOTYPE_NAME);
        return ConcurrencyResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link ConcurrencyResourceClassifier} proxy from a {@link Classifier} stereotyped << ConcurrencyResource_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link ConcurrencyResourceClassifier} proxy or <i>null</i>.
     */
    @objid ("0806e342-e869-4078-ad50-d637d02866ae")
    public static ConcurrencyResourceClassifier instantiate(final Classifier obj) {
        return ConcurrencyResourceClassifier.canInstantiate(obj) ? new ConcurrencyResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ConcurrencyResourceClassifier} proxy from a {@link Classifier} stereotyped << ConcurrencyResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link ConcurrencyResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("fcaaf905-c3f9-49aa-ac96-e2adafc86b77")
    public static ConcurrencyResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (ConcurrencyResourceClassifier.canInstantiate(obj))
        	return new ConcurrencyResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("ConcurrencyResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3f96e997-ed95-4889-b5a1-c34194855963")
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
        ConcurrencyResourceClassifier other = (ConcurrencyResourceClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("7cf0c2b3-1f20-4770-957c-597949a42d23")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    @objid ("cc08fa66-1882-4b0f-9309-af4e9b2f0e3b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("51f280cd-0f1c-45b7-86f8-04607ef000e2")
    protected ConcurrencyResourceClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("7c9ba7d6-29c3-4aaa-8311-39e97bff0767")
    public static final class MdaTypes {
        @objid ("c39da9b0-8f98-4afd-8093-48d5c67aa3b3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2933c519-2582-461d-a6be-d6abf256c5ff")
        private static Stereotype MDAASSOCDEP;

        @objid ("eb2381a9-e8f9-4ee5-ac4d-dc617b8d03b6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d1503fd6-367c-45d2-8759-e49cd7bebb3c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fff86708-0cce-11df-8525-001302895b2b");
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
