/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier;

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
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << Resource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class ResourceClassifier {
    public static final String STEREOTYPE_NAME = "Resource_Classifier";

    public static final String RESOURCE_CLASSIFIER_ISACTIVE_TAGTYPE = "Resource_Classifier_isActive";

    public static final String RESOURCE_CLASSIFIER_ISPROTECTED_TAGTYPE = "Resource_Classifier_isProtected";

    public static final String RESOURCE_CLASSIFIER_RESMULT_TAGTYPE = "Resource_Classifier_resMult";

    /**
     * The underlying {@link Classifier} represented by this proxy, never null.
     */
    protected final Classifier elt;

    /**
     * Tells whether a {@link ResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << Resource_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << Resource_Classifier >> then instantiate a {@link ResourceClassifier} proxy.
     * 
     * @return a {@link ResourceClassifier} proxy on the created {@link Classifier}.
     */
    public static ResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ResourceClassifier.STEREOTYPE_NAME);
        return ResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link ResourceClassifier} proxy from a {@link Classifier} stereotyped << Resource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link ResourceClassifier} proxy or <i>null</i>.
     */
    public static ResourceClassifier instantiate(final Classifier obj) {
        return ResourceClassifier.canInstantiate(obj) ? new ResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ResourceClassifier} proxy from a {@link Classifier} stereotyped << Resource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link ResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static ResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (ResourceClassifier.canInstantiate(obj))
        	return new ResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("ResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        ResourceClassifier other = (ResourceClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    public Classifier getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Resource_Classifier_resMult'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getResource_Classifier_resMult() {
        return this.elt.getTagValue(ResourceClassifier.MdaTypes.RESOURCE_CLASSIFIER_RESMULT_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Resource_Classifier_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isResource_Classifier_isActive() {
        return this.elt.isTagged(ResourceClassifier.MdaTypes.RESOURCE_CLASSIFIER_ISACTIVE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'Resource_Classifier_isProtected'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isResource_Classifier_isProtected() {
        return this.elt.isTagged(ResourceClassifier.MdaTypes.RESOURCE_CLASSIFIER_ISPROTECTED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Resource_Classifier_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setResource_Classifier_isActive(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(ResourceClassifier.MdaTypes.RESOURCE_CLASSIFIER_ISACTIVE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(ResourceClassifier.MdaTypes.RESOURCE_CLASSIFIER_ISACTIVE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Resource_Classifier_isProtected'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setResource_Classifier_isProtected(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(ResourceClassifier.MdaTypes.RESOURCE_CLASSIFIER_ISPROTECTED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(ResourceClassifier.MdaTypes.RESOURCE_CLASSIFIER_ISPROTECTED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Resource_Classifier_resMult'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setResource_Classifier_resMult(final String value) {
        this.elt.putTagValue(ResourceClassifier.MdaTypes.RESOURCE_CLASSIFIER_RESMULT_TAGTYPE_ELT, value);
    }

    protected ResourceClassifier(final Classifier elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType RESOURCE_CLASSIFIER_RESMULT_TAGTYPE_ELT;

        public static TagType RESOURCE_CLASSIFIER_ISPROTECTED_TAGTYPE_ELT;

        public static TagType RESOURCE_CLASSIFIER_ISACTIVE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "7fc9127e-101a-11df-86fe-0014222a9f79");
            RESOURCE_CLASSIFIER_RESMULT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8bb9a838-101a-11df-86fe-0014222a9f79");
            RESOURCE_CLASSIFIER_ISPROTECTED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8bb9a839-101a-11df-86fe-0014222a9f79");
            RESOURCE_CLASSIFIER_ISACTIVE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8bb9a83a-101a-11df-86fe-0014222a9f79");
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
